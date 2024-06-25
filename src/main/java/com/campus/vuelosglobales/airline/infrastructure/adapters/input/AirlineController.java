package com.campus.vuelosglobales.airline.infrastructure.adapters.input;

import com.campus.vuelosglobales.airline.application.services.AirlineService;
import com.campus.vuelosglobales.airline.domain.entities.Airline;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airlines")
public class AirlineController {

    private final AirlineService airlineService;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @GetMapping
    public List<Airline> getAllAirlines() {
        return airlineService.findAll();
    }

    @GetMapping("/{id}")
    public Airline getAirlineById(@PathVariable Integer id) {
        return airlineService.findById(id);
    }

    @PostMapping
    public Airline createAirline(@RequestBody Airline airline) {
        return airlineService.save(airline);
    }

    @PutMapping("/{id}")
    public Airline updateAirline(@PathVariable Long id, @RequestBody Airline airline) {
        airline.setId(id);
        return airlineService.save(airline);
    }

    @DeleteMapping("/{id}")
    public void deleteAirline(@PathVariable Integer id) {
        airlineService.deleteById(id);
    }
}
