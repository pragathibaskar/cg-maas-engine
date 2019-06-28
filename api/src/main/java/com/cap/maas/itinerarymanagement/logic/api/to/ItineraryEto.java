package com.cap.maas.itinerarymanagement.logic.api.to;

import java.sql.Timestamp;

import com.cap.maas.itinerarymanagement.common.api.Itinerary;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Itinerary
 */
public class ItineraryEto extends AbstractEto implements Itinerary {

  private static final long serialVersionUID = 1L;

  private String name;

  private String desc;

  private Timestamp creationDate;

  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String getDesc() {

    return this.desc;
  }

  @Override
  public void setDesc(String desc) {

    this.desc = desc;
  }

  @Override
  public Timestamp getCreationDate() {

    return this.creationDate;
  }

  @Override
  public void setCreationDate(Timestamp creationDate) {

    this.creationDate = creationDate;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());
    result = prime * result + ((this.creationDate == null) ? 0 : this.creationDate.hashCode());

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
    ItineraryEto other = (ItineraryEto) obj;
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
    if (this.creationDate == null) {
      if (other.creationDate != null) {
        return false;
      }
    } else if (!this.creationDate.equals(other.creationDate)) {
      return false;
    }

    return true;
  }
}
