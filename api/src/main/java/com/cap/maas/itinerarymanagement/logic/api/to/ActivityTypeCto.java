package com.cap.maas.itinerarymanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of ActivityType
 */
public class ActivityTypeCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private ActivityTypeEto activityType;

  public ActivityTypeEto getActivityType() {

    return activityType;
  }

  public void setActivityType(ActivityTypeEto activityType) {

    this.activityType = activityType;
  }

}
