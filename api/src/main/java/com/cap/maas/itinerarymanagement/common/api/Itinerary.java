package com.cap.maas.itinerarymanagement.common.api;

import java.sql.Timestamp;

import com.cap.maas.general.common.api.ApplicationEntity;

public interface Itinerary extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

  /**
   * @return descId
   */

  public String getDesc();

  /**
   * @param desc setter for desc attribute
   */

  public void setDesc(String desc);

  /**
   * @return creationDateId
   */

  public Timestamp getCreationDate();

  /**
   * @param creationDate setter for creationDate attribute
   */

  public void setCreationDate(Timestamp creationDate);

}
