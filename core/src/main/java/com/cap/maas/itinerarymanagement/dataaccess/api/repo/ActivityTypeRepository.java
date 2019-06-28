package com.cap.maas.itinerarymanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.cap.maas.itinerarymanagement.dataaccess.api.ActivityTypeEntity;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link ActivityTypeEntity}
 */
public interface ActivityTypeRepository extends DefaultRepository<ActivityTypeEntity> {

  /**
   * @param criteria the {@link ActivityTypeSearchCriteriaTo} with the criteria to search.
   * @param pageRequest {@link Pageable} implementation used to set page properties like page size
   * @return the {@link Page} of the {@link ActivityTypeEntity} objects that matched the search.
   */
  default Page<ActivityTypeEntity> findByCriteria(ActivityTypeSearchCriteriaTo criteria) {

    ActivityTypeEntity alias = newDslAlias();
    JPAQuery<ActivityTypeEntity> query = newDslQuery(alias);

    String name = criteria.getName();
    if (name != null && !name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getName()), name, criteria.getNameOption());
    }
    Boolean active = criteria.getActive();
    if (active != null) {
      query.where($(alias.getActive()).eq(active));
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
  public default void addOrderBy(JPAQuery<ActivityTypeEntity> query, ActivityTypeEntity alias, Sort sort) {

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
          case "active":
            if (next.isAscending()) {
              query.orderBy($(alias.getActive()).asc());
            } else {
              query.orderBy($(alias.getActive()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}