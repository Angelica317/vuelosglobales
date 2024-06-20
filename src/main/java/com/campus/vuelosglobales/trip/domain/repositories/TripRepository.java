package com.campus.vuelosglobales.trip.domain.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.trip.domain.entities.Trip;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    // Caso de Uso 2: Asignar Tripulación a Trayecto
    Optional<Trip> findById(Long id);

    // Caso de Uso 6: Consultar Reserva de Vuelo
    List<Trip> findAll();

    // Caso de Uso 9: Consultar Información de Trayecto
    @Query("SELECT t FROM Trip t WHERE t.id = :id")
    Trip findTripById(Long id);

    // Caso de Uso 17: Asignar Aeronave a Trayecto
    @Query("SELECT t FROM Trip t WHERE t.id = :id")
    Trip findTripWithPlaneById(Long id); // Incluir el avión en la consulta

    // Caso de Uso 18: Actualizar Información de Trayecto
    // (No requiere método específico en el repositorio, se usa save())

    // Caso de Uso 19: Eliminar Trayecto
    // (No requiere método específico en el repositorio, se usa delete())

    // Caso de Uso 26: Consultar Asignación de Tripulación
    @Query("SELECT t FROM Trip t JOIN FETCH t.employees WHERE t.id = :id")
    Trip findTripWithCrewById(Long id); 

    // Caso de Uso 27: Consultar Escalas de un Trayecto
    @Query("SELECT t FROM Trip t JOIN FETCH t.flightConnections WHERE t.id = :id")
    Trip findTripWithConnectionsById(Long id); 
}
