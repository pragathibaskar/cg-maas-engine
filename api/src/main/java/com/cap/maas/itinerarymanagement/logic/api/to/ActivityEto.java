package com.cap.maas.itinerarymanagement.logic.api.to;

import com.cap.maas.itinerarymanagement.common.api.Activity;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Activity
 */
public class ActivityEto extends AbstractEto implements Activity {

  private static final long serialVersionUID = 1L;

  private String name;

  private String desc;

  private Long typeId;

  private Long statusId;

  private Long itineraryId;

  private Long priority;

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
  public Long getTypeId() {

    return typeId;
  }

  @Override
  public void setTypeId(Long typeId) {

    this.typeId = typeId;
  }

  @Override
  public Long getStatusId() {

    return statusId;
  }

  @Override
  public void setStatusId(Long statusId) {

    this.statusId = statusId;
  }

  @Override
  public Long getItineraryId() {

    return itineraryId;
  }

  @Override
  public void setItineraryId(Long itineraryId) {

    this.itineraryId = itineraryId;
  }

  @Override
  public Long getPriority() {

    return priority;
  }

  @Override
  public void setPriority(Long priority) {

    this.priority = priority;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());

    result = prime * result + ((this.typeId == null) ? 0 : this.typeId.hashCode());

    result = prime * result + ((this.statusId == null) ? 0 : this.statusId.hashCode());

    result = prime * result + ((this.itineraryId == null) ? 0 : this.itineraryId.hashCode());
    result = prime * result + ((this.priority == null) ? 0 : this.priority.hashCode());
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
    ActivityEto other = (ActivityEto) obj;
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

    if (this.typeId == null) {
      if (other.typeId != null) {
        return false;
      }
    } else if (!this.typeId.equals(other.typeId)) {
      return false;
    }

    if (this.statusId == null) {
      if (other.statusId != null) {
        return false;
      }
    } else if (!this.statusId.equals(other.statusId)) {
      return false;
    }

    if (this.itineraryId == null) {
      if (other.itineraryId != null) {
        return false;
      }
    } else if (!this.itineraryId.equals(other.itineraryId)) {
      return false;
    }
    if (this.priority == null) {
      if (other.priority != null) {
        return false;
      }
    } else if (!this.priority.equals(other.priority)) {
      return false;
    }
    return true;
  }
}
