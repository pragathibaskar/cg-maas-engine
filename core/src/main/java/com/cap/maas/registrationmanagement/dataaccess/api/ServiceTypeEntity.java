package com.cap.maas.registrationmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cap.maas.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.maas.registrationmanagement.common.api.ServiceType;

/**
 * @author dgauda
 */
@Entity
@Table(name = "ServiceType")
public class ServiceTypeEntity extends ApplicationPersistenceEntity implements ServiceType {

  private String name;

  private String desc;

  private Boolean active;

  private static final long serialVersionUID = 1L;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getName}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return active
   */
  public Boolean getActive() {

    return this.active;
  }

  /**
   * @param active new value of {@link #getActive}.
   */
  public void setActive(Boolean active) {

    this.active = active;
  }

  /**
   * @return desc
   */
  public String getDesc() {

    return this.desc;
  }

  /**
   * @param desc new value of {@link #getdesc}.
   */
  public void setDesc(String desc) {

    this.desc = desc;
  }

}
