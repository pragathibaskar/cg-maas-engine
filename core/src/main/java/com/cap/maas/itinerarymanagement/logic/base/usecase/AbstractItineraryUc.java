package com.cap.maas.itinerarymanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.maas.general.logic.base.AbstractUc;
import com.cap.maas.itinerarymanagement.dataaccess.api.repo.ItineraryRepository;

/**
 * Abstract use case for Itinerarys, which provides access to the commonly necessary data access objects.
 */
public class AbstractItineraryUc extends AbstractUc {

  /** @see #getItineraryRepository() */
  @Inject
  private ItineraryRepository itineraryRepository;

  /**
   * Returns the field 'itineraryRepository'.
   * 
   * @return the {@link ItineraryRepository} instance.
   */
  public ItineraryRepository getItineraryRepository() {

    return this.itineraryRepository;
  }

}
