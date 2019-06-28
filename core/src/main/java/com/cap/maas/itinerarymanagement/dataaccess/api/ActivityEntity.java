package com.cap.maas.itinerarymanagement.dataaccess.api;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cap.maas.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.maas.itinerarymanagement.common.api.Activity;

/**
 * @author dgauda
 */
@Entity
@Table(name = "Activity")
public class ActivityEntity extends ApplicationPersistenceEntity implements Activity {

  private String name;

  private String desc;

  private ActivityTypeEntity type;

  private ActivityStatusEntity status;

  private ItineraryEntity itinerary;

  private static final long serialVersionUID = 1L;

  private Long priority;

  /**
   * @return priority
   */
  public Long getPriority() {

    return this.priority;
  }

  /**
   * @param priority new value of {@link #getpriority}.
   */
  public void setPriority(Long priority) {

    this.priority = priority;
  }

  /**
   * @return type
   */
  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "idActType")
  public ActivityTypeEntity getType() {

    return this.type;
  }

  /**
   * @param type new value of {@link #getType}.
   */
  public void setType(ActivityTypeEntity type) {

    this.type = type;
  }

  /**
   * @return type
   */
  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "idActStatus")
  public ActivityStatusEntity getStatus() {

    return this.status;
  }

  /**
   * @param type new value of {@link #getType}.
   */
  public void setStatus(ActivityStatusEntity status) {

    this.status = status;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #setName}.
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
   * @param desc new value of {@link #getDesc}.
   */
  public void setDesc(String desc) {

    this.desc = desc;
  }

  /**
   * @return idItinerary
   * @return itinerary
   */
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "idItinerary")
  public ItineraryEntity getItinerary() {

    return this.itinerary;
  }

  /**
   * @param itinerary new value of {@link #getItinerary}.
   */
  public void setItinerary(ItineraryEntity itinerary) {

    this.itinerary = itinerary;
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
      ActivityTypeEntity activityTypeEntity = new ActivityTypeEntity();
      activityTypeEntity.setId(typeId);
      this.type = activityTypeEntity;
    }
  }

  @Override
  @Transient
  public Long getStatusId() {

    if (this.status == null) {
      return null;
    }
    return this.status.getId();
  }

  @Override
  public void setStatusId(Long statusId) {

    if (statusId == null) {
      this.status = null;
    } else {
      ActivityStatusEntity activityStatusEntity = new ActivityStatusEntity();
      activityStatusEntity.setId(statusId);
      this.status = activityStatusEntity;
    }
  }

  @Override
  @Transient
  public Long getItineraryId() {

    if (this.itinerary == null) {
      return null;
    }
    return this.itinerary.getId();
  }

  @Override
  public void setItineraryId(Long itineraryId) {

    if (itineraryId == null) {
      this.itinerary = null;
    } else {
      ItineraryEntity itineraryEntity = new ItineraryEntity();
      itineraryEntity.setId(itineraryId);
      this.itinerary = itineraryEntity;
    }
  }

}
