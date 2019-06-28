package com.cap.maas.registrationmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cap.maas.registrationmanagement.logic.api.to.RegistrationCto;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationSearchCriteriaTo;

public interface UcFindRegistration {

  /**
   * Returns a composite Registration by its id 'id'.
   *
   * @param id The id 'id' of the Registration.
   * @return The {@link RegistrationCto} with id 'id'
   */
  RegistrationCto findRegistrationCto(long id);

  /**
   * Returns a paginated list of composite Registrations matching the search criteria.
   *
   * @param criteria the {@link RegistrationSearchCriteriaTo}.
   * @return the {@link List} of matching {@link RegistrationCto}s.
   */
  Page<RegistrationCto> findRegistrationCtos(RegistrationSearchCriteriaTo criteria);

}
