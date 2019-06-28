package com.cap.maas.registrationmanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of ServiceType
 */
public class ServiceTypeCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private ServiceTypeEto serviceType;

  public ServiceTypeEto getServiceType() {

    return serviceType;
  }

  public void setServiceType(ServiceTypeEto serviceType) {

    this.serviceType = serviceType;
  }

}
