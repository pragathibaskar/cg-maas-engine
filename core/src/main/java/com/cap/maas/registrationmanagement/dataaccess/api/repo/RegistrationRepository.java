package com.cap.maas.registrationmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.cap.maas.registrationmanagement.dataaccess.api.RegistrationEntity;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link RegistrationEntity}
 */
public interface RegistrationRepository extends DefaultRepository<RegistrationEntity> {

  /**
   * @param criteria the {@link RegistrationSearchCriteriaTo} with the criteria to search.
   * @param pageRequest {@link Pageable} implementation used to set page properties like page size
   * @return the {@link Page} of the {@link RegistrationEntity} objects that matched the search.
   */
  default Page<RegistrationEntity> findByCriteria(RegistrationSearchCriteriaTo criteria) {

    RegistrationEntity alias = newDslAlias();
    JPAQuery<RegistrationEntity> query = newDslQuery(alias);

    String name = criteria.getName();
    if (name != null && !name.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getName()), name, criteria.getNameOption());
    }
    Long type = criteria.getTypeId();
    if (type != null) {
      query.where($(alias.getType().getId()).eq(type));
    }
    String desc = criteria.getDesc();
    if (desc != null && !desc.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getDesc()), desc, criteria.getDescOption());
    }
    Double latitude = criteria.getLatitude();
    if (latitude != null) {
      query.where($(alias.getLatitude()).eq(latitude));
    }
    Double longitude = criteria.getLongitude();
    if (longitude != null) {
      query.where($(alias.getLongitude()).eq(longitude));
    }
    String serviceUrl = criteria.getServiceUrl();
    if (serviceUrl != null && !serviceUrl.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getServiceUrl()), serviceUrl, criteria.getServiceUrlOption());
    }
    String address = criteria.getAddress();
    if (address != null && !address.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getAddress()), address, criteria.getAddressOption());
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
  public default void addOrderBy(JPAQuery<RegistrationEntity> query, RegistrationEntity alias, Sort sort) {

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
          case "type":
            if (next.isAscending()) {
              query.orderBy($(alias.getType().getId()).asc());
            } else {
              query.orderBy($(alias.getType().getId()).desc());
            }
            break;
          case "desc":
            if (next.isAscending()) {
              query.orderBy($(alias.getDesc()).asc());
            } else {
              query.orderBy($(alias.getDesc()).desc());
            }
            break;
          case "latitude":
            if (next.isAscending()) {
              query.orderBy($(alias.getLatitude()).asc());
            } else {
              query.orderBy($(alias.getLatitude()).desc());
            }
            break;
          case "longitude":
            if (next.isAscending()) {
              query.orderBy($(alias.getLongitude()).asc());
            } else {
              query.orderBy($(alias.getLongitude()).desc());
            }
            break;
          case "serviceUrl":
            if (next.isAscending()) {
              query.orderBy($(alias.getServiceUrl()).asc());
            } else {
              query.orderBy($(alias.getServiceUrl()).desc());
            }
            break;
          case "address":
            if (next.isAscending()) {
              query.orderBy($(alias.getAddress()).asc());
            } else {
              query.orderBy($(alias.getAddress()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}