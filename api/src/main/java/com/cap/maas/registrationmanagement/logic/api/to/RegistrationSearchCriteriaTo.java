package com.cap.maas.registrationmanagement.logic.api.to;

import com.cap.maas.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.cap.maas.registrationmanagement.common.api.Registration}s.
 */
public class RegistrationSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private Long typeId;

  private String desc;

  private Double latitude;

  private Double longitude;

  private String serviceUrl;

  private String address;

  private StringSearchConfigTo nameOption;

  private StringSearchConfigTo descOption;

  private StringSearchConfigTo serviceUrlOption;

  private StringSearchConfigTo addressOption;

  /**
   * @return nameId
   */

  public String getName() {

    return name;
  }

  /**
   * @param name setter for name attribute
   */

  public void setName(String name) {

    this.name = name;
  }

  /**
   * getter for typeId attribute
   * 
   * @return typeId
   */

  public Long getTypeId() {

    return typeId;
  }

  /**
   * @param type setter for type attribute
   */

  public void setTypeId(Long typeId) {

    this.typeId = typeId;
  }

  /**
   * @return descId
   */

  public String getDesc() {

    return desc;
  }

  /**
   * @param desc setter for desc attribute
   */

  public void setDesc(String desc) {

    this.desc = desc;
  }

  /**
   * @return latitudeId
   */

  public Double getLatitude() {

    return latitude;
  }

  /**
   * @param latitude setter for latitude attribute
   */

  public void setLatitude(Double latitude) {

    this.latitude = latitude;
  }

  /**
   * @return longitudeId
   */

  public Double getLongitude() {

    return longitude;
  }

  /**
   * @param longitude setter for longitude attribute
   */

  public void setLongitude(Double longitude) {

    this.longitude = longitude;
  }

  /**
   * @return serviceUrlId
   */

  public String getServiceUrl() {

    return serviceUrl;
  }

  /**
   * @param serviceUrl setter for serviceUrl attribute
   */

  public void setServiceUrl(String serviceUrl) {

    this.serviceUrl = serviceUrl;
  }

  /**
   * @return addressId
   */

  public String getAddress() {

    return address;
  }

  /**
   * @param address setter for address attribute
   */

  public void setAddress(String address) {

    this.address = address;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getName() name}.
   */
  public StringSearchConfigTo getNameOption() {

    return this.nameOption;
  }

  /**
   * @param nameOption new value of {@link #getNameOption()}.
   */
  public void setNameOption(StringSearchConfigTo nameOption) {

    this.nameOption = nameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getDesc() desc}.
   */
  public StringSearchConfigTo getDescOption() {

    return this.descOption;
  }

  /**
   * @param descOption new value of {@link #getDescOption()}.
   */
  public void setDescOption(StringSearchConfigTo descOption) {

    this.descOption = descOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getServiceUrl() serviceUrl}.
   */
  public StringSearchConfigTo getServiceUrlOption() {

    return this.serviceUrlOption;
  }

  /**
   * @param serviceUrlOption new value of {@link #getServiceUrlOption()}.
   */
  public void setServiceUrlOption(StringSearchConfigTo serviceUrlOption) {

    this.serviceUrlOption = serviceUrlOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getAddress() address}.
   */
  public StringSearchConfigTo getAddressOption() {

    return this.addressOption;
  }

  /**
   * @param addressOption new value of {@link #getAddressOption()}.
   */
  public void setAddressOption(StringSearchConfigTo addressOption) {

    this.addressOption = addressOption;
  }

}
