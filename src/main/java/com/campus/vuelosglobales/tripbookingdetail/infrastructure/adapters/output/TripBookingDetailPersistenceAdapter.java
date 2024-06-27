package com.campus.vuelosglobales.tripbookingdetail.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.tripbookingdetail.domain.entities.TripBookingDetail;

@Repository
public interface TripBookingDetailPersistenceAdapter extends JpaRepository<TripBookingDetail, Long> {
}
