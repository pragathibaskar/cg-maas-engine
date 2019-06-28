package com.cap.maas.itinerarymanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeSearchCriteriaTo;

public interface UcFindActivityType {

  /**
   * Returns a composite ActivityType by its id 'id'.
   *
   * @param id The id 'id' of the ActivityType.
   * @return The {@link ActivityTypeCto} with id 'id'
   */
  ActivityTypeCto findActivityTypeCto(long id);

  /**
   * Returns a paginated list of composite ActivityTypes matching the search criteria.
   *
   * @param criteria the {@link ActivityTypeSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ActivityTypeCto}s.
   */
  Page<ActivityTypeCto> findActivityTypeCtos(ActivityTypeSearchCriteriaTo criteria);

}
