package com.campus.vuelosglobales.flightfare.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.flightfare.application.Services.FlightFareService;
import com.campus.vuelosglobales.flightfare.domain.entities.FlightFare;

@RestController
@RequestMapping("/flightfares")
public class FlightFareController {

    private final FlightFareService flightFareService;

    public FlightFareController(FlightFareService flightFareService) {
        this.flightFareService = flightFareService;
    }

    @GetMapping
    public List<FlightFare> getAllFlightFares() {
        return flightFareService.findAll();
    }

    @GetMapping("/{id}")
    public FlightFare getFlightFareById(@PathVariable Long id) {
        return flightFareService.findById(id);
    }

    @PostMapping
    public FlightFare createFlightFare(@RequestBody FlightFare flightFare) {
        return flightFareService.save(flightFare);
    }

    @PutMapping("/{id}")
    public FlightFare updateFlightFare(@PathVariable Long id, @RequestBody FlightFare flightFare) {
        flightFare.setId(id);
        return flightFareService.save(flightFare);
    }

    @DeleteMapping("/{id}")
    public void deleteFlightFare(@PathVariable Long id) {
        flightFareService.deleteById(id);
    }
}
