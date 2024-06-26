package com.campus.vuelosglobales.city.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.city.application.Services.CityService;
import com.campus.vuelosglobales.city.domain.entities.City;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<City> getAllCities() {
        return cityService.findAll();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Long id) {
        return cityService.findById(id);
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.save(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable Long id, @RequestBody City city) {
        city.setId(id);
        return cityService.save(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteById(id);
    }
}
