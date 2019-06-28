package com.cap.maas.itinerarymanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.maas.itinerarymanagement.logic.api.to.ActivityCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivitySearchCriteriaTo;

public interface UcFindActivity {

  /**
   * Returns a composite Activity by its id 'id'.
   *
   * @param id The id 'id' of the Activity.
   * @return The {@link ActivityCto} with id 'id'
   */
  ActivityCto findActivityCto(long id);

  /**
   * Returns a paginated list of composite Activitys matching the search criteria.
   *
   * @param criteria the {@link ActivitySearchCriteriaTo}.
   * @return the {@link List} of matching {@link ActivityCto}s.
   */
  Page<ActivityCto> findActivityCtos(ActivitySearchCriteriaTo criteria);

}
