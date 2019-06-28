package com.cap.maas.registrationmanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.cap.maas.registrationmanagement.dataaccess.api.RegistrationEntity;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationCto;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationEto;
import com.cap.maas.registrationmanagement.logic.api.to.RegistrationSearchCriteriaTo;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeEto;
import com.cap.maas.registrationmanagement.logic.api.usecase.UcFindRegistration;
import com.cap.maas.registrationmanagement.logic.base.usecase.AbstractRegistrationUc;

/**
 * Use case implementation for searching, filtering and getting Registrations
 */
@Named
@Validated
@Transactional
public class UcFindRegistrationImpl extends AbstractRegistrationUc implements UcFindRegistration {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindRegistrationImpl.class);

  @Override
  public RegistrationCto findRegistrationCto(long id) {

    LOG.debug("Get RegistrationCto with id {} from database.", id);
    RegistrationEntity entity = getRegistrationRepository().find(id);
    RegistrationCto cto = new RegistrationCto();
    cto.setRegistration(getBeanMapper().map(entity, RegistrationEto.class));
    cto.setType(getBeanMapper().map(entity.getType(), ServiceTypeEto.class));

    return cto;
  }

  @Override
  public Page<RegistrationCto> findRegistrationCtos(RegistrationSearchCriteriaTo criteria) {

    Page<RegistrationEntity> registrations = getRegistrationRepository().findByCriteria(criteria);
    List<RegistrationCto> ctos = new ArrayList<>();
    for (RegistrationEntity entity : registrations.getContent()) {
      RegistrationCto cto = new RegistrationCto();
      cto.setRegistration(getBeanMapper().map(entity, RegistrationEto.class));
      cto.setType(getBeanMapper().map(entity.getType(), ServiceTypeEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, registrations.getTotalElements());
  }
}
