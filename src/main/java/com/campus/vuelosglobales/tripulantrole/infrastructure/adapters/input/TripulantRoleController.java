package com.campus.vuelosglobales.tripulantrole.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.tripulantrole.application.Services.TripulantRoleService;
import com.campus.vuelosglobales.tripulantrole.domain.entities.TripulantRole;

@RestController
@RequestMapping("/tripulantroles")
public class TripulantRoleController {

    private final TripulantRoleService tripulantRoleService;

    public TripulantRoleController(TripulantRoleService tripulantRoleService) {
        this.tripulantRoleService = tripulantRoleService;
    }

    @GetMapping
    public List<TripulantRole> getAllTripulantRoles() {
        return tripulantRoleService.findAll();
    }

    @GetMapping("/{id}")
    public TripulantRole getTripulantRoleById(@PathVariable Long id) {
        return tripulantRoleService.findById(id);
    }

    @PostMapping
    public TripulantRole createTripulantRole(@RequestBody TripulantRole tripulantRole) {
        return tripulantRoleService.save(tripulantRole);
    }

    @PutMapping("/{id}")
    public TripulantRole updateTripulantRole(@PathVariable Long id, @RequestBody TripulantRole tripulantRole) {
        tripulantRole.setId(id);
        return tripulantRoleService.save(tripulantRole);
    }

    @DeleteMapping("/{id}")
    public void deleteTripulantRole(@PathVariable Long id) {
        tripulantRoleService.deleteById(id);
    }
}
