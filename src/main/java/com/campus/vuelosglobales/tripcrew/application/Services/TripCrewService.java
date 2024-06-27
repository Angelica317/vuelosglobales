package com.campus.vuelosglobales.tripcrew.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.tripcrew.domain.entities.TripCrew;
import com.campus.vuelosglobales.tripcrew.domain.entities.TripCrewPK;
import com.campus.vuelosglobales.tripcrew.domain.repositories.TripCrewRepository;

@Service
public class TripCrewService {

    private final TripCrewRepository tripCrewRepository;

    public TripCrewService(TripCrewRepository tripCrewRepository) {
        this.tripCrewRepository = tripCrewRepository;
    }

    public List<TripCrew> findAll() {
        return tripCrewRepository.findAll();
    }

    public TripCrew findById(TripCrewPK id) {
        return tripCrewRepository.findById(id).orElse(null);
    }

    public TripCrew save(TripCrew tripCrew) {
        return tripCrewRepository.save(tripCrew);
    }

    public void deleteById(TripCrewPK id) {
        tripCrewRepository.deleteById(id);
    }
}
