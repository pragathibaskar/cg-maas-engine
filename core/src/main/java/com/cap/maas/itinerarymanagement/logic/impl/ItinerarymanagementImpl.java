package com.cap.maas.itinerarymanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.maas.general.logic.base.AbstractComponentFacade;
import com.cap.maas.itinerarymanagement.logic.api.Itinerarymanagement;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivitySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ItineraryCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItinerarySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivity;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivityStatus;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivityType;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindItinerary;

/**
 * Implementation of component interface of itinerarymanagement
 */
@Named
public class ItinerarymanagementImpl extends AbstractComponentFacade implements Itinerarymanagement {

  @Inject
  private UcFindActivityType ucFindActivityType;

  @Inject
  private UcFindActivityStatus ucFindActivityStatus;

  @Inject
  private UcFindActivity ucFindActivity;

  @Inject
  private UcFindItinerary ucFindItinerary;

  @Override
  public ActivityTypeCto findActivityTypeCto(long id) {

    return ucFindActivityType.findActivityTypeCto(id);
  }

  @Override
  public Page<ActivityTypeCto> findActivityTypeCtos(ActivityTypeSearchCriteriaTo criteria) {

    return ucFindActivityType.findActivityTypeCtos(criteria);
  }

  @Override
  public ActivityStatusCto findActivityStatusCto(long id) {

    return ucFindActivityStatus.findActivityStatusCto(id);
  }

  @Override
  public Page<ActivityStatusCto> findActivityStatusCtos(ActivityStatusSearchCriteriaTo criteria) {

    return ucFindActivityStatus.findActivityStatusCtos(criteria);
  }

  @Override
  public ActivityCto findActivityCto(long id) {

    return ucFindActivity.findActivityCto(id);
  }

  @Override
  public Page<ActivityCto> findActivityCtos(ActivitySearchCriteriaTo criteria) {

    return ucFindActivity.findActivityCtos(criteria);
  }

  @Override
  public ItineraryCto findItineraryCto(long id) {

    return ucFindItinerary.findItineraryCto(id);
  }

  @Override
  public Page<ItineraryCto> findItineraryCtos(ItinerarySearchCriteriaTo criteria) {

    return ucFindItinerary.findItineraryCtos(criteria);
  }

}
