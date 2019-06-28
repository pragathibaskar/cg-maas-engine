package com.cap.maas.registrationmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.cap.maas.general.logic.base.AbstractUc;
import com.cap.maas.registrationmanagement.dataaccess.api.repo.ServiceTypeRepository;

/**
 * Abstract use case for ServiceTypes, which provides access to the commonly necessary data access objects.
 */
public class AbstractServiceTypeUc extends AbstractUc {

  /** @see #getServiceTypeRepository() */
  @Inject
  private ServiceTypeRepository serviceTypeRepository;

  /**
   * Returns the field 'serviceTypeRepository'.
   * 
   * @return the {@link ServiceTypeRepository} instance.
   */
  public ServiceTypeRepository getServiceTypeRepository() {

    return this.serviceTypeRepository;
  }

}
