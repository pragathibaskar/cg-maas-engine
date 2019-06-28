package com.cap.maas.itinerarymanagement.dataaccess.api;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cap.maas.general.dataaccess.api.ApplicationPersistenceEntity;
import com.cap.maas.itinerarymanagement.common.api.Itinerary;

/**
 * @author dgauda
 */
@Entity
@Table(name = "Itinerary")
public class ItineraryEntity extends ApplicationPersistenceEntity implements Itinerary {

  private String name;

  private String desc;

  @Temporal(TemporalType.TIMESTAMP)
  private Timestamp creationDate;

  private List<ActivityEntity> activities;

  private static final long serialVersionUID = 1L;

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

  /**
   * @return dateAndTime
   */
  public Timestamp getCreationDate() {

    return this.creationDate;
  }

  /**
   * @param dateAndTime new value of {@link #getdateAndTime}.
   */
  public void setCreationDate(Timestamp creationDate) {

    this.creationDate = creationDate;
  }

  /**
   * @return actvities
   */
  @OneToMany(mappedBy = "itinerary", fetch = FetchType.LAZY)
  public List<ActivityEntity> getActivities() {

    return this.activities;
  }

  /**
   * @param idTask new value of {@link #getactvities}.
   */
  public void setActivities(List<ActivityEntity> activities) {

    this.activities = activities;
  }

}
