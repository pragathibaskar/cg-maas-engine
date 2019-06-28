package com.cap.maas.itinerarymanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.cap.maas.itinerarymanagement.dataaccess.api.ActivityEntity;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivitySearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link ActivityEntity}
 */
public interface ActivityRepository extends DefaultRepository<ActivityEntity> {

  /**
   * @param criteria the {@link ActivitySearchCriteriaTo} with the criteria to search.
   * @param pageRequest {@link Pageable} implementation used to set page properties like page size
   * @return the {@link Page} of the {@link ActivityEntity} objects that matched the search.
   */
  default Page<ActivityEntity> findByCriteria(ActivitySearchCriteriaTo criteria) {

    ActivityEntity alias = newDslAlias();
    JPAQuery<ActivityEntity> query = newDslQuery(alias);

    String name = criteria.getName();
    if (name != null && !name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getName()), name, criteria.getNameOption());
    }
    String desc = criteria.getDesc();
    if (desc != null && !desc.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getDesc()), desc, criteria.getDescOption());
    }
    Long type = criteria.getTypeId();
    if (type != null) {
      query.where($(alias.getType().getId()).eq(type));
    }
    Long status = criteria.getStatusId();
    if (status != null) {
      query.where($(alias.getStatus().getId()).eq(status));
    }
    Long itinerary = criteria.getItineraryId();
    if (itinerary != null) {
      query.where($(alias.getItinerary().getId()).eq(itinerary));
    }
    Long priority = criteria.getPriority();
    if (priority != null) {
      query.where($(alias.getPriority()).eq(priority));
    }
    addOrderBy(query, alias, criteria.getPageable().getSort());

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   * 
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<ActivityEntity> query, ActivityEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "name":
            if (next.isAscending()) {
              query.orderBy($(alias.getName()).asc());
            } else {
              query.orderBy($(alias.getName()).desc());
            }
            break;
          case "desc":
            if (next.isAscending()) {
              query.orderBy($(alias.getDesc()).asc());
            } else {
              query.orderBy($(alias.getDesc()).desc());
            }
            break;
          case "type":
            if (next.isAscending()) {
              query.orderBy($(alias.getType().getId()).asc());
            } else {
              query.orderBy($(alias.getType().getId()).desc());
            }
            break;
          case "status":
            if (next.isAscending()) {
              query.orderBy($(alias.getStatus().getId()).asc());
            } else {
              query.orderBy($(alias.getStatus().getId()).desc());
            }
            break;
          case "itinerary":
            if (next.isAscending()) {
              query.orderBy($(alias.getItinerary().getId()).asc());
            } else {
              query.orderBy($(alias.getItinerary().getId()).desc());
            }
            break;
          case "priority":
            if (next.isAscending()) {
              query.orderBy($(alias.getPriority()).asc());
            } else {
              query.orderBy($(alias.getPriority()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}