package com.cap.maas.itinerarymanagement.logic.impl.usecase;

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

import com.cap.maas.itinerarymanagement.dataaccess.api.ItineraryEntity;
import com.cap.maas.itinerarymanagement.logic.api.to.ActivityEto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItineraryCto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItineraryEto;
import com.cap.maas.itinerarymanagement.logic.api.to.ItinerarySearchCriteriaTo;
import com.cap.maas.itinerarymanagement.logic.api.usecase.UcFindItinerary;
import com.cap.maas.itinerarymanagement.logic.base.usecase.AbstractItineraryUc;

/**
 * Use case implementation for searching, filtering and getting Itinerarys
 */
@Named
@Validated
@Transactional
public class UcFindItineraryImpl extends AbstractItineraryUc implements UcFindItinerary {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindItineraryImpl.class);

  @Override
  public ItineraryCto findItineraryCto(long id) {

    LOG.debug("Get ItineraryCto with id {} from database.", id);
    ItineraryEntity entity = getItineraryRepository().find(id);
    ItineraryCto cto = new ItineraryCto();
    cto.setItinerary(getBeanMapper().map(entity, ItineraryEto.class));
    cto.setActivities(getBeanMapper().mapList(entity.getActivities(), ActivityEto.class));

    return cto;
  }

  @Override
  public Page<ItineraryCto> findItineraryCtos(ItinerarySearchCriteriaTo criteria) {

    Page<ItineraryEntity> itinerarys = getItineraryRepository().findByCriteria(criteria);
    List<ItineraryCto> ctos = new ArrayList<>();
    for (ItineraryEntity entity : itinerarys.getContent()) {
      ItineraryCto cto = new ItineraryCto();
      cto.setItinerary(getBeanMapper().map(entity, ItineraryEto.class));
      cto.setActivities(getBeanMapper().mapList(entity.getActivities(), ActivityEto.class));
      ctos.add(cto);
    }
    Pageable pagResultTo = PageRequest.of(criteria.getPageable().getPageNumber(), criteria.getPageable().getPageSize());

    return new PageImpl<>(ctos, pagResultTo, itinerarys.getTotalElements());
  }
}
