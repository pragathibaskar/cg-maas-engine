package com.cap.maas.itinerarymanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Activity
 */
public class ActivityCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private ActivityEto activity;

  private ActivityTypeEto type;

  private ActivityStatusEto status;

  private ItineraryEto itinerary;

  public ActivityEto getActivity() {

    return activity;
  }

  public void setActivity(ActivityEto activity) {

    this.activity = activity;
  }

  public ActivityTypeEto getType() {

    return type;
  }

  public void setType(ActivityTypeEto type) {

    this.type = type;
  }

  public ActivityStatusEto getStatus() {

    return status;
  }

  public void setStatus(ActivityStatusEto status) {

    this.status = status;
  }

  public ItineraryEto getItinerary() {

    return itinerary;
  }

  public void setItinerary(ItineraryEto itinerary) {

    this.itinerary = itinerary;
  }

}
