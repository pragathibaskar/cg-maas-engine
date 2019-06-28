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

import com.cap.maas.registrationmanagement.dataaccess.api.ServiceTypeEntity;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeCto;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeEto;
import com.cap.maas.registrationmanagement.logic.api.to.ServiceTypeSearchCriteriaTo;
import com.cap.maas.registrationmanagement.logic.api.usecase.UcFindServiceType;
import com.cap.maas.registrationmanagement.logic.base.usecase.AbstractServiceTypeUc;

/**
 * Use case implementation for searching, filtering and getting ServiceTypes
 */
@Named
@Validated
@Transactional
public class UcFindServiceTypeImpl extends AbstractServiceTypeUc implements UcFindServiceType {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindServiceTypeImpl.class);

  @Override
  public ServiceTypeCto findServiceTypeCto(long id) {

    LOG.debug("Get ServiceTypeCto with id {} from database.", id);
    ServiceTypeEntity entity = getServiceTypeRepository().find(id);
    ServiceTypeCto cto = new ServiceTypeCto();
    cto.setServiceType(getBeanMapper().map(entity, ServiceTypeEto.class));

    return cto;
  }

  @Override
  public Page<ServiceTypeCto> findServiceTypeCtos(ServiceTypeSearchCriteriaTo criteria) {

    Page<ServiceTypeEntity> servicetypes = getServiceTypeRepository().findByCriteria(criteria);
    List<ServiceTypeCto> ctos = new ArrayList<>();
    for (ServiceTypeEntity entity : servicetypes.getContent()) {
      ServiceTypeCto cto = new ServiceTypeCto();
      cto.setServiceType(getBeanMapper().map(entity, ServiceTypeEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, servicetypes.getTotalElements());
  }
}
