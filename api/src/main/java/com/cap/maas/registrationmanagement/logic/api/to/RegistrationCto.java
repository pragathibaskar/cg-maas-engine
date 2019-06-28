package com.cap.maas.registrationmanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Registration
 */
public class RegistrationCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private RegistrationEto registration;

  private ServiceTypeEto type;

  public RegistrationEto getRegistration() {

    return registration;
  }

  public void setRegistration(RegistrationEto registration) {

    this.registration = registration;
  }

  public ServiceTypeEto getType() {

    return type;
  }

  public void setType(ServiceTypeEto type) {

    this.type = type;
  }

}
