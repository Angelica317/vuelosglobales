package com.campus.vuelosglobales.airport.application.usecases;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.airport.application.Services.AirportService;
import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.plane.application.usecases.UseCase;


@Component
public class InformationAirportUseCase implements UseCase {
    private final AirportService AirportService;

    public InformationAirportUseCase(AirportService AirportService) {
        this.AirportService = AirportService;
    }

    @SuppressWarnings("resource")
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el ID del avión a consultar: ");
            try {
                Long id = Long.parseLong(scanner.nextLine());

                Airport Airport = AirportService.findById(id);
                if (Airport == null) {
                    System.out.println("Avión no encontrado.");
                    return;
                }

                mostrarInformacionDelAeropuerto(Airport);

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un ID válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ocurrió un error inesperado.");
        }
    }

    public void mostrarInformacionDelAeropuerto(Airport Airport) {
        System.out.println("+-----------------+----------------------+");
        System.out.println("| Campo           | Valor                |");
        System.out.println("+-----------------+----------------------+");
        System.out.printf("| ID               | %-20s |\n", Airport.getId());
        System.out.printf("| Nombre           | %-20s |\n", Airport.getName());
        System.out.printf("| Ciudad           | %-20d |\n", Airport.getCity().getName());
        System.out.println("+-----------------+----------------------+");
    }
}
