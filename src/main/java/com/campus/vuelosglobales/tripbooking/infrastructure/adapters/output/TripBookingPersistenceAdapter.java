package com.campus.vuelosglobales.tripbooking.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.tripbooking.domain.entities.TripBooking;

@Repository
public interface TripBookingPersistenceAdapter extends JpaRepository<TripBooking, Long> {
}
