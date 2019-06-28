package com.cap.maas.itinerarymanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.maas.itinerarymanagement.logic.api.Itinerarymanagement;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivitySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ItineraryCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItinerarySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.service.api.rest.ItinerarymanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Itinerarymanagement}.
 */
@Named("ItinerarymanagementRestService")
public class ItinerarymanagementRestServiceImpl implements ItinerarymanagementRestService {

  @Inject
  private Itinerarymanagement itinerarymanagement;

  @Override
  public ActivityTypeCto getActivityTypeCto(long id) {

    return this.itinerarymanagement.findActivityTypeCto(id);
  }

  @Override
  public Page<ActivityTypeCto> findActivityTypeCtos(ActivityTypeSearchCriteriaTo searchCriteriaTo) {

    return this.itinerarymanagement.findActivityTypeCtos(searchCriteriaTo);
  }

  @Override
  public ActivityStatusCto getActivityStatusCto(long id) {

    return this.itinerarymanagement.findActivityStatusCto(id);
  }

  @Override
  public Page<ActivityStatusCto> findActivityStatusCtos(ActivityStatusSearchCriteriaTo searchCriteriaTo) {

    return this.itinerarymanagement.findActivityStatusCtos(searchCriteriaTo);
  }

  @Override
  public ActivityCto getActivityCto(long id) {

    return this.itinerarymanagement.findActivityCto(id);
  }

  @Override
  public Page<ActivityCto> findActivityCtos(ActivitySearchCriteriaTo searchCriteriaTo) {

    return this.itinerarymanagement.findActivityCtos(searchCriteriaTo);
  }

  @Override
  public ItineraryCto getItineraryCto(long id) {

    return this.itinerarymanagement.findItineraryCto(id);
  }

  @Override
  public Page<ItineraryCto> findItineraryCtos(ItinerarySearchCriteriaTo searchCriteriaTo) {

    return this.itinerarymanagement.findItineraryCtos(searchCriteriaTo);
  }

}
