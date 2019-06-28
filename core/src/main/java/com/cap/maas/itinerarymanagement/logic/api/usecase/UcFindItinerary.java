package com.cap.maas.itinerarymanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.maas.itinerarymanagement.logic.api.to.ItineraryCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItinerarySearchCriteriaTo;

public interface UcFindItinerary {

  /**
   * Returns a composite Itinerary by its id 'id'.
   *
   * @param id The id 'id' of the Itinerary.
   * @return The {@link ItineraryCto} with id 'id'
   */
  ItineraryCto findItineraryCto(long id);

  /**
   * Returns a paginated list of composite Itinerarys matching the search criteria.
   *
   * @param criteria the {@link ItinerarySearchCriteriaTo}.
   * @return the {@link List} of matching {@link ItineraryCto}s.
   */
  Page<ItineraryCto> findItineraryCtos(ItinerarySearchCriteriaTo criteria);

}
