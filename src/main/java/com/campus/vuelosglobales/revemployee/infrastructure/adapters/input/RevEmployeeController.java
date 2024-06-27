package com.campus.vuelosglobales.revemployee.infrastructure.adapters.input;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.campus.vuelosglobales.revemployee.application.Services.RevEmployeeService;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployee;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployeePK;

@RestController
@RequestMapping("/revemployees")
public class RevEmployeeController {
    private final RevEmployeeService revEmployeeService;

    public RevEmployeeController(RevEmployeeService revEmployeeService) {
        this.revEmployeeService = revEmployeeService;
    }

    @GetMapping
    public List<RevEmployee> getAllRevEmployees() {
        return revEmployeeService.findAll();
    }

    @GetMapping("/{employeeId}/{revisionId}")
    public RevEmployee getRevEmployeeById(@PathVariable Long employeeId, @PathVariable Long revisionId) {
        RevEmployeePK id = new RevEmployeePK(employeeId, revisionId);
        return revEmployeeService.findById(id);
    }

    @PostMapping
    public RevEmployee createRevEmployee(@RequestBody RevEmployee revEmployee) {
        return revEmployeeService.save(revEmployee);
    }

    @PutMapping("/{employeeId}/{revisionId}")
    public RevEmployee updateRevEmployee(@PathVariable Long employeeId, @PathVariable Long revisionId, @RequestBody RevEmployee revEmployee) {
        RevEmployeePK id = new RevEmployeePK(employeeId, revisionId);
        revEmployee.setId(id);
        return revEmployeeService.save(revEmployee);
    }

    @DeleteMapping("/{employeeId}/{revisionId}")
    public void deleteRevEmployee(@PathVariable Long employeeId, @PathVariable Long revisionId) {
        RevEmployeePK id = new RevEmployeePK(employeeId, revisionId);
        revEmployeeService.deleteById(id);
    }
}