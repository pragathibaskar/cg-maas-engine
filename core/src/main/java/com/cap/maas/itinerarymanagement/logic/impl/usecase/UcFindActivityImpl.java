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

import com.cap.maas.itinerarymanagement.dataaccess.api.ActivityEntity;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityEto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivitySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusEto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeEto;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivity;
import com.cap.maas.itinerarymanagement.logic.base.usecase.AbstractActivityUc;

/**
 * Use case implementation for searching, filtering and getting Activitys
 */
@Named
@Validated
@Transactional
public class UcFindActivityImpl extends AbstractActivityUc implements UcFindActivity {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindActivityImpl.class);

  @Override
  public ActivityCto findActivityCto(long id) {

    LOG.debug("Get ActivityCto with id {} from database.", id);
    ActivityEntity entity = getActivityRepository().find(id);
    ActivityCto cto = new ActivityCto();
    cto.setActivity(getBeanMapper().map(entity, ActivityEto.class));
    cto.setType(getBeanMapper().map(entity.getType(), ActivityTypeEto.class));
    cto.setStatus(getBeanMapper().map(entity.getStatus(), ActivityStatusEto.class));
    // cto.setItinerary(getBeanMapper().map(entity.getItinerary(), ItineraryEto.class));

    return cto;
  }

  @Override
  public Page<ActivityCto> findActivityCtos(ActivitySearchCriteriaTo criteria) {

    Page<ActivityEntity> activitys = getActivityRepository().findByCriteria(criteria);
    List<ActivityCto> ctos = new ArrayList<>();
    for (ActivityEntity entity : activitys.getContent()) {
      ActivityCto cto = new ActivityCto();
      cto.setActivity(getBeanMapper().map(entity, ActivityEto.class));
      cto.setType(getBeanMapper().map(entity.getType(), ActivityTypeEto.class));
      cto.setStatus(getBeanMapper().map(entity.getStatus(), ActivityStatusEto.class));
      // cto.setItinerary(getBeanMapper().map(entity.getItinerary(), ItineraryEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, activitys.getTotalElements());
  }
}
