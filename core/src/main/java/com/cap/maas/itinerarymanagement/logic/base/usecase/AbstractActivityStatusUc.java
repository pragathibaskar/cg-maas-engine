package com.cap.maas.itinerarymanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.maas.general.logic.base.AbstractUc;
import com.cap.maas.itinerarymanagement.dataaccess.api.repo.ActivityStatusRepository;

/**
 * Abstract use case for ActivityStatuss, which provides access to the commonly necessary data access objects.
 */
public class AbstractActivityStatusUc extends AbstractUc {

  /** @see #getActivityStatusRepository() */
  @Inject
  private ActivityStatusRepository activityStatusRepository;

  /**
   * Returns the field 'activityStatusRepository'.
   * 
   * @return the {@link ActivityStatusRepository} instance.
   */
  public ActivityStatusRepository getActivityStatusRepository() {

    return this.activityStatusRepository;
  }

}
