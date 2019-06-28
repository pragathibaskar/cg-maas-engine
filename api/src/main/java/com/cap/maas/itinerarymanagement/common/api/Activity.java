package com.cap.maas.itinerarymanagement.common.api;

import com.cap.maas.general.common.api.ApplicationEntity;

public interface Activity extends ApplicationEntity {

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
   * getter for typeId attribute
   * 
   * @return typeId
   */

  public Long getTypeId();

  /**
   * @param type setter for type attribute
   */

  public void setTypeId(Long typeId);

  /**
   * getter for statusId attribute
   * 
   * @return statusId
   */

  public Long getStatusId();

  /**
   * @param status setter for status attribute
   */

  public void setStatusId(Long statusId);

  /**
   * getter for itineraryId attribute
   * 
   * @return itineraryId
   */

  public Long getItineraryId();

  /**
   * @param itinerary setter for itinerary attribute
   */

  public void setItineraryId(Long itineraryId);

  /**
   * @return priorityId
   */

  public Long getPriority();

  /**
   * @param priority setter for priority attribute
   */

  public void setPriority(Long priority);

}
