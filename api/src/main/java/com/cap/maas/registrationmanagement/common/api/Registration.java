package com.cap.maas.registrationmanagement.common.api;

import com.cap.maas.general.common.api.ApplicationEntity;

public interface Registration extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

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
   * @return descId
   */

  public String getDesc();

  /**
   * @param desc setter for desc attribute
   */

  public void setDesc(String desc);

  /**
   * @return latitudeId
   */

  public Double getLatitude();

  /**
   * @param latitude setter for latitude attribute
   */

  public void setLatitude(Double latitude);

  /**
   * @return longitudeId
   */

  public Double getLongitude();

  /**
   * @param longitude setter for longitude attribute
   */

  public void setLongitude(Double longitude);

  /**
   * @return serviceUrlId
   */

  public String getServiceUrl();

  /**
   * @param serviceUrl setter for serviceUrl attribute
   */

  public void setServiceUrl(String serviceUrl);

  /**
   * @return addressId
   */

  public String getAddress();

  /**
   * @param address setter for address attribute
   */

  public void setAddress(String address);

}
