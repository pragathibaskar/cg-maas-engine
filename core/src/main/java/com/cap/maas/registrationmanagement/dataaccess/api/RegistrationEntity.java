package com.cap.maas.registrationmanagement.dataaccess.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cap.maas.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.maas.registrationmanagement.common.api.Registration;

/**
 * @author dgauda
 */
@Entity
@Table(name = "ServiceRegistration")
public class RegistrationEntity extends ApplicationPersistenceEntity implements Registration {

  private String name;

  private ServiceTypeEntity type;

  private String desc;

  private Double latitude;

  private Double longitude;

  private String serviceUrl;

  private String address;

  private static final long serialVersionUID = 1L;

  /**
   * @return type
   */
  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "idServiceType")
  public ServiceTypeEntity getType() {

    return this.type;
  }

  /**
   * @param type new value of {@link #getType}.
   */
  public void setType(ServiceTypeEntity type) {

    this.type = type;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return latitude
   */
  public Double getLatitude() {

    return this.latitude;
  }

  /**
   * @param latitude new value of {@link #getlatitude}.
   */
  public void setLatitude(Double latitude) {

    this.latitude = latitude;
  }

  /**
   * @return longitude
   */
  public Double getLongitude() {

    return this.longitude;
  }

  /**
   * @param longitude new value of {@link #getlongitude}.
   */
  public void setLongitude(Double longitude) {

    this.longitude = longitude;
  }

  /**
   * @return serviceUrl
   */
  public String getServiceUrl() {

    return this.serviceUrl;
  }

  /**
   * @param serviceUrl new value of {@link #getserviceUrl}.
   */
  public void setServiceUrl(String serviceUrl) {

    this.serviceUrl = serviceUrl;
  }

  /**
   * @return address
   */
  public String getAddress() {

    return this.address;
  }

  /**
   * @param address new value of {@link #getaddress}.
   */
  public void setAddress(String address) {

    this.address = address;
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

  @Override
  @Transient
  public Long getTypeId() {

    if (this.type == null) {
      return null;
    }
    return this.type.getId();
  }

  @Override
  public void setTypeId(Long typeId) {

    if (typeId == null) {
      this.type = null;
    } else {
      ServiceTypeEntity serviceTypeEntity = new ServiceTypeEntity();
      serviceTypeEntity.setId(typeId);
      this.type = serviceTypeEntity;
    }
  }

}
