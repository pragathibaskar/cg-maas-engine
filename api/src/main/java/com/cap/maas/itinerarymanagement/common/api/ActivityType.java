package com.cap.maas.itinerarymanagement.common.api;

import com.cap.maas.general.common.api.ApplicationEntity;

public interface ActivityType extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

  /**
   * @return activeId
   */

  public Boolean getActive();

  /**
   * @param active setter for active attribute
   */

  public void setActive(Boolean active);

}
