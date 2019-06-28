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

import com.cap.maas.itinerarymanagement.dataaccess.api.ActivityStatusEntity;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusEto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivityStatus;
import com.cap.maas.itinerarymanagement.logic.base.usecase.AbstractActivityStatusUc;

/**
 * Use case implementation for searching, filtering and getting ActivityStatuss
 */
@Named
@Validated
@Transactional
public class UcFindActivityStatusImpl extends AbstractActivityStatusUc implements UcFindActivityStatus {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindActivityStatusImpl.class);

  @Override
  public ActivityStatusCto findActivityStatusCto(long id) {

    LOG.debug("Get ActivityStatusCto with id {} from database.", id);
    ActivityStatusEntity entity = getActivityStatusRepository().find(id);
    ActivityStatusCto cto = new ActivityStatusCto();
    cto.setActivityStatus(getBeanMapper().map(entity, ActivityStatusEto.class));

    return cto;
  }

  @Override
  public Page<ActivityStatusCto> findActivityStatusCtos(ActivityStatusSearchCriteriaTo criteria) {

    Page<ActivityStatusEntity> activitystatuss = getActivityStatusRepository().findByCriteria(criteria);
    List<ActivityStatusCto> ctos = new ArrayList<>();
    for (ActivityStatusEntity entity : activitystatuss.getContent()) {
      ActivityStatusCto cto = new ActivityStatusCto();
      cto.setActivityStatus(getBeanMapper().map(entity, ActivityStatusEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, activitystatuss.getTotalElements());
  }
}
