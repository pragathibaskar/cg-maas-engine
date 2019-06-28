package com.cap.maas.registrationmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeCto;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeSearchCriteriaTo;

public interface UcFindServiceType {

  /**
   * Returns a composite ServiceType by its id 'id'.
   *
   * @param id The id 'id' of the ServiceType.
   * @return The {@link ServiceTypeCto} with id 'id'
   */
  ServiceTypeCto findServiceTypeCto(long id);

  /**
   * Returns a paginated list of composite ServiceTypes matching the search criteria.
   *
   * @param criteria the {@link ServiceTypeSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ServiceTypeCto}s.
   */
  Page<ServiceTypeCto> findServiceTypeCtos(ServiceTypeSearchCriteriaTo criteria);

}
