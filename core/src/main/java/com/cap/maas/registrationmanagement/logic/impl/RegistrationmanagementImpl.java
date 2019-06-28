package com.cap.maas.registrationmanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.cap.maas.general.logic.base.AbstractComponentFacade;
import com.cap.maas.registrationmanagement.logic.api.Registrationmanagement;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationCto;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationSearchCriteriaTo;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeCto;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeSearchCriteriaTo;
import com.cap.maas.registrationmanagement.logic.api.usecase.UcFindRegistration;
import com.cap.maas.registrationmanagement.logic.api.usecase.UcFindServiceType;

/**
 * Implementation of component interface of registrationmanagement
 */
@Named
public class RegistrationmanagementImpl extends AbstractComponentFacade implements Registrationmanagement {

  @Inject
  private UcFindServiceType ucFindServiceType;

  @Inject
  private UcFindRegistration ucFindRegistration;

  @Override
  public ServiceTypeCto findServiceTypeCto(long id) {

    return ucFindServiceType.findServiceTypeCto(id);
  }

  @Override
  public Page<ServiceTypeCto> findServiceTypeCtos(ServiceTypeSearchCriteriaTo criteria) {

    return ucFindServiceType.findServiceTypeCtos(criteria);
  }

  @Override
  public RegistrationCto findRegistrationCto(long id) {

    return ucFindRegistration.findRegistrationCto(id);
  }

  @Override
  public Page<RegistrationCto> findRegistrationCtos(RegistrationSearchCriteriaTo criteria) {

    return ucFindRegistration.findRegistrationCtos(criteria);
  }

}
