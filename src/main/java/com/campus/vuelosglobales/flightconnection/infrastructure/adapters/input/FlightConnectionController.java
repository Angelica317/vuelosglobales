package com.campus.vuelosglobales.flightconnection.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.flightconnection.application.Services.FlightConnectionService;
import com.campus.vuelosglobales.flightconnection.domain.entities.FlightConnection;

@RestController
@RequestMapping("/flightconnections")
public class FlightConnectionController {

    private final FlightConnectionService flightConnectionService;

    public FlightConnectionController(FlightConnectionService flightConnectionService) {
        this.flightConnectionService = flightConnectionService;
    }

    @GetMapping
    public List<FlightConnection> getAllFlightConnections() {
        return flightConnectionService.findAll();
    }

    @GetMapping("/{id}")
    public FlightConnection getFlightConnectionById(@PathVariable Long id) {
        return flightConnectionService.findById(id);
    }

    @PostMapping
    public FlightConnection createFlightConnection(@RequestBody FlightConnection flightConnection) {
        return flightConnectionService.save(flightConnection);
    }

    @PutMapping("/{id}")
    public FlightConnection updateFlightConnection(@PathVariable Long id, @RequestBody FlightConnection flightConnection) {
        flightConnection.setId(id);
        return flightConnectionService.save(flightConnection);
    }

    @DeleteMapping("/{id}")
    public void deleteFlightConnection(@PathVariable Long id) {
        flightConnectionService.deleteById(id);
    }
}
