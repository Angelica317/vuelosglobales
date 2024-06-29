package com.campus.vuelosglobales.airport.application.usecases;

import com.campus.vuelosglobales.airport.application.Services.AirportService;
import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.plane.application.usecases.UseCase;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DeleteAirportUseCase implements UseCase {
    private final Scanner scanner;
    private final AirportService AirportService;

    public DeleteAirportUseCase(AirportService AirportService) {
        this.scanner = new Scanner(System.in);
        this.AirportService = AirportService;
    }

    @Override
    public void execute() throws Exception {
        System.out.println("Eliminando Aeropuerto...");
        
        System.out.print("Ingrese el ID del Aeropuerto a eliminar: ");
        Long id = Long.parseLong(scanner.nextLine());
        
        Airport Airport = AirportService.findById(id);
        if (Airport == null) {
            System.out.println("Aeropuerto no encontrado.");
            return;
        }

        // Mostrar información del Airport antes de eliminar
        System.out.println("Información del Aeropuerto a eliminar:");
        System.out.println("ID: " + Airport.getId());
        System.out.println("Nombre: " + Airport.getName());
        System.out.println("Ciudad: " + Airport.getCity().getName());

        System.out.print("¿Está seguro que desea eliminar este Aeropuerto? (s/n): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("s")) {
            AirportService.deleteById(id);
            System.out.println("Aeropuerto eliminado con éxito.");
        } else {
            System.out.println("Operación de eliminación cancelada.");
        }
    }
}