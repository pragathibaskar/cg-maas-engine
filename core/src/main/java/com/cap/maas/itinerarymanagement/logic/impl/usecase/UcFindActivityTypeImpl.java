package com.cap.maas.itinerarymanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.cap.maas.itinerarymanagement.dataaccess.api.ActivityTypeEntity;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeEto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivityType;
import com.cap.maas.itinerarymanagement.logic.base.usecase.AbstractActivityTypeUc;

/**
 * Use case implementation for searching, filtering and getting ActivityTypes
 */
@Named
@Validated
@Transactional
public class UcFindActivityTypeImpl extends AbstractActivityTypeUc implements UcFindActivityType {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindActivityTypeImpl.class);

  @Override
  public ActivityTypeCto findActivityTypeCto(long id) {

    LOG.debug("Get ActivityTypeCto with id {} from database.", id);
    ActivityTypeEntity entity = getActivityTypeRepository().find(id);
    ActivityTypeCto cto = new ActivityTypeCto();
    cto.setActivityType(getBeanMapper().map(entity, ActivityTypeEto.class));

    return cto;
  }

  @Override
  public Page<ActivityTypeCto> findActivityTypeCtos(ActivityTypeSearchCriteriaTo criteria) {

    Page<ActivityTypeEntity> activitytypes = getActivityTypeRepository().findByCriteria(criteria);
    List<ActivityTypeCto> ctos = new ArrayList<>();
    for (ActivityTypeEntity entity : activitytypes.getContent()) {
      ActivityTypeCto cto = new ActivityTypeCto();
      cto.setActivityType(getBeanMapper().map(entity, ActivityTypeEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, activitytypes.getTotalElements());
  }
}
