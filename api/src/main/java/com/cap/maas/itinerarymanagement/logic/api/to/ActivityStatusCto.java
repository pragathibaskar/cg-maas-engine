package com.cap.maas.itinerarymanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of ActivityStatus
 */
public class ActivityStatusCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private ActivityStatusEto activityStatus;

  public ActivityStatusEto getActivityStatus() {

    return activityStatus;
  }

  public void setActivityStatus(ActivityStatusEto activityStatus) {

    this.activityStatus = activityStatus;
  }

}
