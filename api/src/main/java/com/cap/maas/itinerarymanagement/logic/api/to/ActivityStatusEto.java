package com.cap.maas.itinerarymanagement.logic.api.to;

import com.cap.maas.itinerarymanagement.common.api.ActivityStatus;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of ActivityStatus
 */
public class ActivityStatusEto extends AbstractEto implements ActivityStatus {

  private static final long serialVersionUID = 1L;

  private String name;

  private String desc;

  @Override
  public String getName() {

    return name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getDesc() {

    return desc;
  }

  @Override
  public void setDesc(String desc) {

    this.desc = desc;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    ActivityStatusEto other = (ActivityStatusEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    if (this.desc == null) {
      if (other.desc != null) {
        return false;
      }
    } else if (!this.desc.equals(other.desc)) {
      return false;
    }
    return true;
  }
}
