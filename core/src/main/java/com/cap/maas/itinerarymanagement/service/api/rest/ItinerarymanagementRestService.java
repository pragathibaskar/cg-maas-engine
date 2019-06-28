package com.cap.maas.itinerarymanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.cap.maas.itinerarymanagement.logic.api.Itinerarymanagement;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivitySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityStatusSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityTypeSearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.to.ItineraryCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItinerarySearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Itinerarymanagement}.
 */
@Path("/itinerarymanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface ItinerarymanagementRestService {

  /**
   * Delegates to {@link Itinerarymanagement#findActivityTypeCto}.
   *
   * @param id the ID of the {@link ActivityTypeCto}
   * @return the {@link ActivityTypeCto}
   */
  @GET
  @Path("/activitytype/cto/{id}/")
  public ActivityTypeCto getActivityTypeCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Itinerarymanagement#findActivityTypeCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding activitytypes.
   * @return the {@link Page list} of matching {@link ActivityTypeCto}s.
   */
  @Path("/activitytype/cto/search")
  @POST
  public Page<ActivityTypeCto> findActivityTypeCtos(ActivityTypeSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Itinerarymanagement#findActivityStatusCto}.
   *
   * @param id the ID of the {@link ActivityStatusCto}
   * @return the {@link ActivityStatusCto}
   */
  @GET
  @Path("/activitystatus/cto/{id}/")
  public ActivityStatusCto getActivityStatusCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Itinerarymanagement#findActivityStatusCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding activitystatuss.
   * @return the {@link Page list} of matching {@link ActivityStatusCto}s.
   */
  @Path("/activitystatus/cto/search")
  @POST
  public Page<ActivityStatusCto> findActivityStatusCtos(ActivityStatusSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Itinerarymanagement#findActivityCto}.
   *
   * @param id the ID of the {@link ActivityCto}
   * @return the {@link ActivityCto}
   */
  @GET
  @Path("/activity/cto/{id}/")
  public ActivityCto getActivityCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Itinerarymanagement#findActivityCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding activitys.
   * @return the {@link Page list} of matching {@link ActivityCto}s.
   */
  @Path("/activity/cto/search")
  @POST
  public Page<ActivityCto> findActivityCtos(ActivitySearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Itinerarymanagement#findItineraryCto}.
   *
   * @param id the ID of the {@link ItineraryCto}
   * @return the {@link ItineraryCto}
   */
  @GET
  @Path("/itinerary/cto/{id}/")
  public ItineraryCto getItineraryCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Itinerarymanagement#findItineraryCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding itinerarys.
   * @return the {@link Page list} of matching {@link ItineraryCto}s.
   */
  @Path("/itinerary/cto/search")
  @POST
  public Page<ItineraryCto> findItineraryCtos(ItinerarySearchCriteriaTo searchCriteriaTo);

}
