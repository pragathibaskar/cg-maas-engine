package com.cap.maas.registrationmanagement.logic.api.to;

import com.cap.maas.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.cap.maas.registrationmanagement.common.api.ServiceType}s.
 */
public class ServiceTypeSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private String desc;

  private Boolean active;

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
   * @return activeId
   */

  public Boolean getActive() {

    return active;
  }

  /**
   * @param active setter for active attribute
   */

  public void setActive(Boolean active) {

    this.active = active;
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
