package com.cap.maas.itinerarymanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cap.maas.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.maas.itinerarymanagement.common.api.ActivityType;

/**
 * @author dgauda
 */
@Entity
@Table(name = "ActivityType")
public class ActivityTypeEntity extends ApplicationPersistenceEntity implements ActivityType {

  private String name;

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

}
