package com.campus.vuelosglobales.tripcrew.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.tripcrew.application.Services.TripCrewService;
import com.campus.vuelosglobales.tripcrew.domain.entities.TripCrew;
import com.campus.vuelosglobales.tripcrew.domain.entities.TripCrewPK;

@RestController
@RequestMapping("/tripcrews")
public class TripCrewController {

    private final TripCrewService tripCrewService;

    public TripCrewController(TripCrewService tripCrewService) {
        this.tripCrewService = tripCrewService;
    }

    @GetMapping
    public List<TripCrew> getAllTripCrews() {
        return tripCrewService.findAll();
    }

    @GetMapping("/{idEmployee}/{idConnection}")
    public TripCrew getTripCrewById(@PathVariable Long idEmployee, @PathVariable Long idConnection) {
        TripCrewPK id = new TripCrewPK(idEmployee, idConnection);
        return tripCrewService.findById(id);
    }

    @PostMapping
    public TripCrew createTripCrew(@RequestBody TripCrew tripCrew) {
        return tripCrewService.save(tripCrew);
    }

    @PutMapping("/{idEmployee}/{idConnection}")
    public TripCrew updateTripCrew(@PathVariable Long idEmployee, @PathVariable Long idConnection, @RequestBody TripCrew tripCrew) {
        TripCrewPK id = new TripCrewPK(idEmployee, idConnection);
        tripCrew.setId(id);
        return tripCrewService.save(tripCrew);
    }

    @DeleteMapping("/{idEmployee}/{idConnection}")
    public void deleteTripCrew(@PathVariable Long idEmployee, @PathVariable Long idConnection) {
        TripCrewPK id = new TripCrewPK(idEmployee, idConnection);
        tripCrewService.deleteById(id);
    }
}
