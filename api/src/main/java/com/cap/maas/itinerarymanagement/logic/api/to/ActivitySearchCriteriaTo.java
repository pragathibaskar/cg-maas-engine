package com.cap.maas.itinerarymanagement.logic.api.to;

import com.cap.maas.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.cap.maas.itinerarymanagement.common.api.Activity}s.
 */
public class ActivitySearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String desc;

  private Long typeId;

  private Long statusId;

  private Long itineraryId;

  private Long priority;

  private StringSearchConfigTo nameOption;

  private StringSearchConfigTo descOption;

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
   * getter for statusId attribute
   * 
   * @return statusId
   */

  public Long getStatusId() {

    return statusId;
  }

  /**
   * @param status setter for status attribute
   */

  public void setStatusId(Long statusId) {

    this.statusId = statusId;
  }

  /**
   * getter for itineraryId attribute
   * 
   * @return itineraryId
   */

  public Long getItineraryId() {

    return itineraryId;
  }

  /**
   * @param itinerary setter for itinerary attribute
   */

  public void setItineraryId(Long itineraryId) {

    this.itineraryId = itineraryId;
  }

  /**
   * @return priorityId
   */

  public Long getPriority() {

    return priority;
  }

  /**
   * @param priority setter for priority attribute
   */

  public void setPriority(Long priority) {

    this.priority = priority;
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

}
