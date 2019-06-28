package com.cap.maas.itinerarymanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.maas.general.logic.base.AbstractUc;
import com.cap.maas.itinerarymanagement.dataaccess.api.repo.ActivityRepository;

/**
 * Abstract use case for Activitys, which provides access to the commonly necessary data access objects.
 */
public class AbstractActivityUc extends AbstractUc {

  /** @see #getActivityRepository() */
  @Inject
  private ActivityRepository activityRepository;

  /**
   * Returns the field 'activityRepository'.
   * 
   * @return the {@link ActivityRepository} instance.
   */
  public ActivityRepository getActivityRepository() {

    return this.activityRepository;
  }

}
