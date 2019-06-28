package com.cap.maas.registrationmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.maas.general.logic.base.AbstractUc;
import com.cap.maas.registrationmanagement.dataaccess.api.repo.RegistrationRepository;

/**
 * Abstract use case for Registrations, which provides access to the commonly necessary data access objects.
 */
public class AbstractRegistrationUc extends AbstractUc {

  /** @see #getRegistrationRepository() */
  @Inject
  private RegistrationRepository registrationRepository;

  /**
   * Returns the field 'registrationRepository'.
   * 
   * @return the {@link RegistrationRepository} instance.
   */
  public RegistrationRepository getRegistrationRepository() {

    return this.registrationRepository;
  }

}
