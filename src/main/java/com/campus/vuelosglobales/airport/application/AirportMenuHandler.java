package com.campus.vuelosglobales.airport.application;

import org.springframework.stereotype.Component;
// import org.springframework.beans.factory.annotation.Autowired;

import com.campus.vuelosglobales.airport.application.usecases.RegisterAirportUseCase;
import com.campus.vuelosglobales.airport.application.usecases.UpdateAirportUseCase;
import com.campus.vuelosglobales.airport.application.usecases.DeleteAirportUseCase;
import com.campus.vuelosglobales.airport.application.usecases.InformationAirportUseCase;

@Component
public class AirportMenuHandler {
    
    private final RegisterAirportUseCase registerAirportUseCase;
    private final UpdateAirportUseCase updateAirportUseCase;
    private final DeleteAirportUseCase deleteAirportUseCase;
    private final InformationAirportUseCase informationAirportUseCase;
    
    // @Autowired
    public AirportMenuHandler(RegisterAirportUseCase registerAirportUseCase, UpdateAirportUseCase updateAirportUseCase,
            DeleteAirportUseCase deleteAirportUseCase, InformationAirportUseCase informationAirportUseCase) {
        this.registerAirportUseCase = registerAirportUseCase;
        this.updateAirportUseCase = updateAirportUseCase;
        this.deleteAirportUseCase = deleteAirportUseCase;
        this.informationAirportUseCase = informationAirportUseCase;
    }

    public void manejarOpcionSubmenuAeropuertos(int opcionSubMenu) throws Exception {
        switch (opcionSubMenu) {
            case 1:
                registerAirportUseCase.execute();
                break;
            case 2:
                updateAirportUseCase.execute();
                break;
            case 3:
                deleteAirportUseCase.execute();
                break;
            case 4:
                //consultar informacion del Aeropuerto
                informationAirportUseCase.execute();
                break;
                //Volver al menu principal
            case 0:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}
