package com.campus.vuelosglobales.airport.application.usecases;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.airport.application.Services.AirportService;
import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.city.application.Services.CityService;
import com.campus.vuelosglobales.city.domain.entities.City;
import com.campus.vuelosglobales.plane.application.usecases.UseCase;

@Component
public class RegisterAirportUseCase implements UseCase {
    private final Scanner scanner;
    private final CityService CityService;
    private final AirportService AirportService;

    public RegisterAirportUseCase(CityService CityService, AirportService AirportService) {
        this.scanner = new Scanner(System.in);
        this.CityService = CityService;
        this.AirportService = AirportService;
    }

    
    @Override
    public void execute() {
        System.out.println("Registrando nuevo Aeropuerto...");
        
        System.out.print("Ingrese el nombre: ");
        String plates = scanner.nextLine();
        
        City city = selectCity();

        Airport newAirport = Airport.builder()
                .name(plates)
                .city(city)
                .build();

        AirportService.save(newAirport);
        System.out.println("Aeropuerto registrado con éxito.");
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