package com.cap.maas.itinerarymanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cap.maas.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.maas.itinerarymanagement.common.api.ActivityStatus;

/**
 * @author dgauda
 */
@Entity
@Table(name = "ActivityStatus")
public class ActivityStatusEntity extends ApplicationPersistenceEntity implements ActivityStatus {

  private String name;

  private String desc;

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
