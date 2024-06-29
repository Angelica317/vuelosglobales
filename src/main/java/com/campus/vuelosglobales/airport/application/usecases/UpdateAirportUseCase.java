package com.campus.vuelosglobales.airport.application.usecases;

import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.airport.application.Services.AirportService;
import com.campus.vuelosglobales.city.application.Services.CityService;
import com.campus.vuelosglobales.city.domain.entities.City;
import com.campus.vuelosglobales.plane.application.usecases.UseCase;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class UpdateAirportUseCase implements UseCase {
    private final Scanner scanner;
    private final AirportService AirportService;
    private final CityService CityService;

    public UpdateAirportUseCase(AirportService AirportService, CityService CityService) {
        this.scanner = new Scanner(System.in);
        this.AirportService = AirportService;
        this.CityService = CityService;
    }

    @Override
    public void execute() {
        System.out.println("Actualizando información del Aeropuerto...");
        
        System.out.print("Ingrese el ID del Aeropuerto a actualizar: ");
        Long id = Long.parseLong(scanner.nextLine());
        
        Airport Airport = AirportService.findById(id);
        if (Airport == null) {
            System.out.println("Aeropuerto no encontrado.");
            return;
        }

        System.out.print("Ingrese el nuevo nombre: ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            Airport.setName(name);
        }

        System.out.println("¿Desea actualizar la ciudad? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            City newCity = selectCity();
            Airport.setCity(newCity);
        }

        AirportService.save(Airport);
        System.out.println("Información del Aeropuerto actualizada con éxito.");
    }

    private City selectCity() {
        List<City> Cityes = CityService.findAll();
        System.out.println("Seleccione una ciudad:");
        for (int i = 0; i < Cityes.size(); i++) {
            System.out.println((i+1) + ". " + Cityes.get(i).getName());
        }
        int selection = Integer.parseInt(scanner.nextLine()) - 1;
        return Cityes.get(selection);
    }
}