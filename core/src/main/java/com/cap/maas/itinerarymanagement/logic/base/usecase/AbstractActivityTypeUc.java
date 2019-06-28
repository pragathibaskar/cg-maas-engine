package com.cap.maas.itinerarymanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.maas.general.logic.base.AbstractUc;
import com.cap.maas.itinerarymanagement.dataaccess.api.repo.ActivityTypeRepository;

/**
 * Abstract use case for ActivityTypes, which provides access to the commonly necessary data access objects.
 */
public class AbstractActivityTypeUc extends AbstractUc {

  /** @see #getActivityTypeRepository() */
  @Inject
  private ActivityTypeRepository activityTypeRepository;

  /**
   * Returns the field 'activityTypeRepository'.
   * 
   * @return the {@link ActivityTypeRepository} instance.
   */
  public ActivityTypeRepository getActivityTypeRepository() {

    return this.activityTypeRepository;
  }

}
