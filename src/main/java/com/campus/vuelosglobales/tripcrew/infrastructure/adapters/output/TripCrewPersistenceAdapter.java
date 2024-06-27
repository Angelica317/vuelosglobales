package com.campus.vuelosglobales.tripcrew.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.tripcrew.domain.entities.TripCrew;
import com.campus.vuelosglobales.tripcrew.domain.entities.TripCrewPK;

@Repository
public interface TripCrewPersistenceAdapter extends JpaRepository<TripCrew, TripCrewPK> {
}
