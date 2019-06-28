package com.cap.maas.itinerarymanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusSearchCriteriaTo;

public interface UcFindActivityStatus {

  /**
   * Returns a composite ActivityStatus by its id 'id'.
   *
   * @param id The id 'id' of the ActivityStatus.
   * @return The {@link ActivityStatusCto} with id 'id'
   */
  ActivityStatusCto findActivityStatusCto(long id);

  /**
   * Returns a paginated list of composite ActivityStatuss matching the search criteria.
   *
   * @param criteria the {@link ActivityStatusSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ActivityStatusCto}s.
   */
  Page<ActivityStatusCto> findActivityStatusCtos(ActivityStatusSearchCriteriaTo criteria);

}
