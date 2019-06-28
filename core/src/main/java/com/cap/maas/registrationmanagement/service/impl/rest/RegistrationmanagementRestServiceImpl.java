package com.cap.maas.registrationmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.maas.registrationmanagement.logic.api.Registrationmanagement;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationCto;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationSearchCriteriaTo;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeCto;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeSearchCriteriaTo;
import com.cap.maas.registrationmanagement.service.api.rest.RegistrationmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Registrationmanagement}.
 */
@Named("RegistrationmanagementRestService")
public class RegistrationmanagementRestServiceImpl implements RegistrationmanagementRestService {

  @Inject
  private Registrationmanagement registrationmanagement;

  @Override
  public ServiceTypeCto getServiceTypeCto(long id) {

    return this.registrationmanagement.findServiceTypeCto(id);
  }

  @Override
  public Page<ServiceTypeCto> findServiceTypeCtos(ServiceTypeSearchCriteriaTo searchCriteriaTo) {

    return this.registrationmanagement.findServiceTypeCtos(searchCriteriaTo);
  }

  @Override
  public RegistrationCto getRegistrationCto(long id) {

    return this.registrationmanagement.findRegistrationCto(id);
  }

  @Override
  public Page<RegistrationCto> findRegistrationCtos(RegistrationSearchCriteriaTo searchCriteriaTo) {

    return this.registrationmanagement.findRegistrationCtos(searchCriteriaTo);
  }

}
