package com.cap.maas.itinerarymanagement.logic.api.to;

import java.util.List;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Itinerary
 */
public class ItineraryCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private ItineraryEto itinerary;

  private List<ActivityEto> activities;

  public ItineraryEto getItinerary() {

    return itinerary;
  }

  public void setItinerary(ItineraryEto itinerary) {

    this.itinerary = itinerary;
  }

  public List<ActivityEto> getActivities() {

    return activities;
  }

  public void setActivities(List<ActivityEto> activities) {

    this.activities = activities;
  }

}
