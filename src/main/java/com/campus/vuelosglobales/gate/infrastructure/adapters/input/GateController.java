package com.campus.vuelosglobales.gate.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.gate.application.Services.GateService;
import com.campus.vuelosglobales.gate.domain.entities.Gate;

@RestController
@RequestMapping("/gates")
public class GateController {

    private final GateService gateService;

    public GateController(GateService gateService) {
        this.gateService = gateService;
    }

    @GetMapping
    public List<Gate> getAllGates() {
        return gateService.findAll();
    }

    @GetMapping("/{id}")
    public Gate getGateById(@PathVariable Long id) {
        return gateService.findById(id);
    }

    @PostMapping
    public Gate createGate(@RequestBody Gate gate) {
        return gateService.save(gate);
    }

    @PutMapping("/{id}")
    public Gate updateGate(@PathVariable Long id, @RequestBody Gate gate) {
        gate.setId(id);
        return gateService.save(gate);
    }

    @DeleteMapping("/{id}")
    public void deleteGate(@PathVariable Long id) {
        gateService.deleteById(id);
    }
}
