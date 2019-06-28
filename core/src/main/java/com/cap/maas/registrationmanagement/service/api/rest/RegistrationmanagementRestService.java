package com.cap.maas.registrationmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.cap.maas.registrationmanagement.logic.api.Registrationmanagement;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationCto;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationSearchCriteriaTo;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeCto;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeSearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of component {@link Registrationmanagement}.
 */
@Path("/registrationmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface RegistrationmanagementRestService {

  /**
   * Delegates to {@link Registrationmanagement#findServiceTypeCto}.
   *
   * @param id the ID of the {@link ServiceTypeCto}
   * @return the {@link ServiceTypeCto}
   */
  @GET
  @Path("/servicetype/cto/{id}/")
  public ServiceTypeCto getServiceTypeCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Registrationmanagement#findServiceTypeCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding servicetypes.
   * @return the {@link Page list} of matching {@link ServiceTypeCto}s.
   */
  @Path("/servicetype/cto/search")
  @POST
  public Page<ServiceTypeCto> findServiceTypeCtos(ServiceTypeSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Registrationmanagement#findRegistrationCto}.
   *
   * @param id the ID of the {@link RegistrationCto}
   * @return the {@link RegistrationCto}
   */
  @GET
  @Path("/registration/cto/{id}/")
  public RegistrationCto getRegistrationCto(@PathParam("id") long id);

  /**
   * Delegates to {@link Registrationmanagement#findRegistrationCtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding registrations.
   * @return the {@link Page list} of matching {@link RegistrationCto}s.
   */
  @Path("/registration/cto/search")
  @POST
  public Page<RegistrationCto> findRegistrationCtos(RegistrationSearchCriteriaTo searchCriteriaTo);

}
