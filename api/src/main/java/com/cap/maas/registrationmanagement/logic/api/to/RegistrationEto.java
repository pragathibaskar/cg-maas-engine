package com.cap.maas.registrationmanagement.logic.api.to;

import com.cap.maas.registrationmanagement.common.api.Registration;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Registration
 */
public class RegistrationEto extends AbstractEto implements Registration {

  private static final long serialVersionUID = 1L;

  private String name;

  private Long typeId;

  private String desc;

  private Double latitude;

  private Double longitude;

  private String serviceUrl;

  private String address;

  @Override
  public String getName() {

    return name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
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
  public String getDesc() {

    return desc;
  }

  @Override
  public void setDesc(String desc) {

    this.desc = desc;
  }

  @Override
  public Double getLatitude() {

    return latitude;
  }

  @Override
  public void setLatitude(Double latitude) {

    this.latitude = latitude;
  }

  @Override
  public Double getLongitude() {

    return longitude;
  }

  @Override
  public void setLongitude(Double longitude) {

    this.longitude = longitude;
  }

  @Override
  public String getServiceUrl() {

    return serviceUrl;
  }

  @Override
  public void setServiceUrl(String serviceUrl) {

    this.serviceUrl = serviceUrl;
  }

  @Override
  public String getAddress() {

    return address;
  }

  @Override
  public void setAddress(String address) {

    this.address = address;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());

    result = prime * result + ((this.typeId == null) ? 0 : this.typeId.hashCode());
    result = prime * result + ((this.desc == null) ? 0 : this.desc.hashCode());
    result = prime * result + ((this.latitude == null) ? 0 : this.latitude.hashCode());
    result = prime * result + ((this.longitude == null) ? 0 : this.longitude.hashCode());
    result = prime * result + ((this.serviceUrl == null) ? 0 : this.serviceUrl.hashCode());
    result = prime * result + ((this.address == null) ? 0 : this.address.hashCode());
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
    RegistrationEto other = (RegistrationEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }

    if (this.typeId == null) {
      if (other.typeId != null) {
        return false;
      }
    } else if (!this.typeId.equals(other.typeId)) {
      return false;
    }
    if (this.desc == null) {
      if (other.desc != null) {
        return false;
      }
    } else if (!this.desc.equals(other.desc)) {
      return false;
    }
    if (this.latitude == null) {
      if (other.latitude != null) {
        return false;
      }
    } else if (!this.latitude.equals(other.latitude)) {
      return false;
    }
    if (this.longitude == null) {
      if (other.longitude != null) {
        return false;
      }
    } else if (!this.longitude.equals(other.longitude)) {
      return false;
    }
    if (this.serviceUrl == null) {
      if (other.serviceUrl != null) {
        return false;
      }
    } else if (!this.serviceUrl.equals(other.serviceUrl)) {
      return false;
    }
    if (this.address == null) {
      if (other.address != null) {
        return false;
      }
    } else if (!this.address.equals(other.address)) {
      return false;
    }
    return true;
  }
}
