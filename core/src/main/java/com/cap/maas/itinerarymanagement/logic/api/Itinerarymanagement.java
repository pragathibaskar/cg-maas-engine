package com.cap.maas.itinerarymanagement.logic.api;

import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivity;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivityStatus;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindActivityType;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindItinerary;

/**
 * Interface for Itinerarymanagement component.
 */
public interface Itinerarymanagement extends UcFindActivityType, UcFindActivityStatus, UcFindActivity, UcFindItinerary {

}
