package com.campus.vuelosglobales;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class vuelosglobales implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(vuelosglobales.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcionPrincipal, opcionSubMenu;

        do{
            mostrarMenuPrincipal();
            opcionPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    mostrarSubMenuAviones();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuAviones(opcionSubMenu);
                    break;
                case 2:
                    mostrarSubMenuTripulacion();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuTripulacion(opcionSubMenu);
                    break;
                case 3:
                    mostrarSubMenuRutasyEscalas();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuRutasyEscalas(opcionSubMenu);
                    break;
                case 4:
                    mostrarSubMenuAeropuertos();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuAeropuertos(opcionSubMenu);
                    break;
                case 5:
                    mostrarSubMenuReservas();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuReservas(opcionSubMenu);
                    break;
                case 6:
                    mostrarSubMenuClientes();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuClientes(opcionSubMenu);
                    break;
                case 7:
                    mostrarSubMenuTarifas();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuTarifas(opcionSubMenu);
                    break;
                case 8:
                    mostrarSubMenuDocumentos();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuDocumentos(opcionSubMenu);
                    break;
                case 9:
                    mostrarSubMenuBuscaryReservarVuelos();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubmenuBuscaryReservarVuelos(opcionSubMenu);
                    break;
                case 10:
                    mostrarSubMenuConsultas();
                    opcionSubMenu = scanner.nextInt();
                    scanner.nextLine();
                    manejarOpcionSubMenuCosultas(opcionSubMenu);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");              
            }

        } while (opcionPrincipal != 11);
        scanner.close();
    }

    private void manejarOpcionSubMenuCosultas(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Consultar Información de Vuelo
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }     
    }

    private static void mostrarSubMenuConsultas() {
        System.out.println("\n====================================");
        System.out.println("            CONSULTAS               ");
        System.out.println("====================================");
        System.out.println("1. Consultar Información de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuBuscaryReservarVuelos(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Buscar Vuelos
                break;
            case 2:
                //Seleccionar Vuelo 
                break;
            case 3:
                //Añadir Pasajeros
                break;
            case 4:
                //Seleccionar Asientos
                break;
            case 5:
                //Realizar Pago
                break;
            case 6:
                //Consultar Reserva de Vuelo
                break;
            case 7:
                //Cancelar Reserva de Vuelo
                break;
            case 8:
                //Modificar Reserva de Vuelo
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuBuscaryReservarVuelos() {
        System.out.println("\n====================================");
        System.out.println("    BUSCAR Y RESERVAR VUELOS        ");
        System.out.println("====================================");
        System.out.println("1. Buscar Vuelos");
        System.out.println("------------------------------------");
        System.out.println("2. Seleccionar Vuelo");
        System.out.println("------------------------------------");
        System.out.println("3. Añadir Pasajeros");
        System.out.println("------------------------------------");
        System.out.println("4. Seleccionar Asientos");
        System.out.println("------------------------------------");
        System.out.println("5. Realizar Pago");
        System.out.println("------------------------------------");
        System.out.println("6. Consultar Reserva de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("7. Cancelar Reserva de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("8. Modificar Reserva de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuDocumentos(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Registrar tipo de documento 
                break;
            case 2:
                //Actualizar tipo de documento 
                break;
            case 3:
                //Eliminar tipo de documento 
                break;
            case 4:
                //Consultar tipo de documento 
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuDocumentos() {
        System.out.println("\n====================================");
        System.out.println("         GESTIÓN DE DOCUMENTOS       ");
        System.out.println("====================================");
        System.out.println("1. Registrar Tipo de Documento");
        System.out.println("------------------------------------");
        System.out.println("2. Actualizar Tipo de Documento");
        System.out.println("------------------------------------");
        System.out.println("3. Eliminar Tipo de Documento");
        System.out.println("------------------------------------");
        System.out.println("4. Consultar Tipo de Documento");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuTarifas(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Registrar tarifa de vuelo
                break;
            case 2:
                //Actualizar Información de tarifa de vuelo
                break;
            case 3:
                //Eliminar tarifa de vuelo
                break;
            case 4:
                //Consultar tarifa de vuelo
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuTarifas() {
        System.out.println("\n====================================");
        System.out.println("         GESTIÓN DE TARIFAS        ");
        System.out.println("====================================");
        System.out.println("1. Registrar Tarifa de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("2. Actualizar Información de Tarifa de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("3. Eliminar Tarifa de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("4. Consultar Tarifa de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuClientes(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Registrar cliente
                break;
            case 2:
                //Consultar informacion cliente
                break;
            case 3:
                //Actualizar informacion cliente
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuClientes() {
        System.out.println("\n====================================");
        System.out.println("         GESTIÓN DE CLIENTES        ");
        System.out.println("====================================");
        System.out.println("1. Registrar Cliente");
        System.out.println("------------------------------------");
        System.out.println("2. Consultar Información de Cliente");
        System.out.println("------------------------------------");
        System.out.println("3. Actualizar Información de Cliente");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuReservas(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Crear Reserva de Vuelo
                break;
            case 2:
                //Consultar Reserva de Vuelo
                break;
            case 3:
                //Eliminar Reserva de Vuelo
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuReservas() {
        System.out.println("\n====================================");
        System.out.println("         GESTIÓN DE RESERVAS        ");
        System.out.println("====================================");
        System.out.println("1. Crear Reserva de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("2. Consultar Reserva de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("3. Eliminar Reserva de Vuelo");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }

    private void manejarOpcionSubmenuAeropuertos(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Registrar Aeropuerto
                break;
            case 2:
                //Actualizar Información de Aeropuerto 
                break;
            case 3:
                //Eliminar Aeropuerto
                break;
            case 4:
                //Consultar Información de Aeropuerto
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuAeropuertos() {
        System.out.println("\n====================================");
        System.out.println("       GESTIÓN DE AEROPUERTOS       ");
        System.out.println("====================================");
        System.out.println("1. Registrar Aeropuerto");
        System.out.println("------------------------------------");
        System.out.println("2. Actualizar Información de Aeropuerto");
        System.out.println("------------------------------------");
        System.out.println("3. Eliminar Aeropuerto");
        System.out.println("------------------------------------");
        System.out.println("4. Consultar Información de Aeropuerto");
        System.out.println("------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuRutasyEscalas(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //Asignar Aeronave a Trayecto
                break;
            case 2:
                //Actualizar Información de Trayecto
                break;
            case 3:
                //Eliminar Trayecto;
                break;
            case 4:
                //Consultar Información de Trayecto
                break;
            case 5:
                //Consultar Escalas de un Trayecto
                break;
            case 6:
                //actualizar informacion de revision
                break;
            case 7:
                //Eliminar Escala
                break;
            case 0:
                //Volver al menu principal
                break;
        
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private static void mostrarSubMenuRutasyEscalas() {
        System.out.println("\n=====================================");
        System.out.println("     GESTIÓN DE RUTAS Y ESCALAS      ");
        System.out.println("=====================================");
        System.out.println("1. Asignar Aeronave a Trayecto");
        System.out.println("-------------------------------------");
        System.out.println("2. Actualizar Información de Trayecto");
        System.out.println("-------------------------------------");
        System.out.println("3. Eliminar Trayecto");
        System.out.println("-------------------------------------");
        System.out.println("4. Consultar Información de Trayecto");
        System.out.println("-------------------------------------");
        System.out.println("5. Consultar Escalas de un Trayecto");
        System.out.println("-------------------------------------");
        System.out.println("6. Actualizar Información de Escala");
        System.out.println("-------------------------------------");
        System.out.println("7. Eliminar Escala");
        System.out.println("-------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("=====================================");
        System.out.print("Seleccione una opción: ");
    }
    

    private void manejarOpcionSubmenuTripulacion(int opcionSubMenu) {
        switch (opcionSubMenu) {
            case 1:
                //logica para registrar avion 
                break;
            case 2:
                //Actualizar informcaion del avion 
                break;
            case 0:
                //Volver al menu principal
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private void mostrarSubMenuTripulacion() {
        System.out.println("\n=============================================");
        System.out.println("            GESTIÓN DE TRIPULACIÓN           ");
        System.out.println("=============================================");
        System.out.println("1. Asignar Tripulación a Trayecto");
        System.out.println("---------------------------------------------");
        System.out.println("2. Consultar Asignación de Tripulación");
        System.out.println("---------------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("=============================================");
        System.out.print("Seleccione una opción: ");
    }

    private void manejarOpcionSubmenuAviones(int opcionSubMenu) {
        
        switch (opcionSubMenu) {
            case 1:
                //logica para registrar avion 
                break;
            case 2:
                //Actualizar informcaion del avion 
                break;
            case 3:
                //Eliminar Avion;
                break;
            case 4:
                //consultar informacion del avion
                break;
            case 5:
                //registrar revision de mantenimiento
                break;
            case 6:
                //actualizar informacion de revision
                break;
            case 7:
                //eliminar revision de mantenimiento 
                break;
            case 8:
                //Consultar historial de revisiones del avion 
                break;
            case 0:
                //Volver al menu principal
                break;
        
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        } 
    }

    private void mostrarSubMenuAviones() {
        System.out.println("\n=============================================");
        System.out.println("              GESTIÓN DE AVIONES             ");
        System.out.println("=============================================");
        System.out.println("1. Registrar Ávion");
        System.out.println("---------------------------------------------");
        System.out.println("2. Actualizar Informacion del Ávion");
        System.out.println("---------------------------------------------");
        System.out.println("3. Eliminar Ávion");
        System.out.println("---------------------------------------------");
        System.out.println("4. Consultar Información de Avión");
        System.out.println("---------------------------------------------");
        System.out.println("5. Registrar Revisión de Mantenimiento");
        System.out.println("---------------------------------------------");
        System.out.println("6. Actualizar Información de Revisión");
        System.out.println("---------------------------------------------");
        System.out.println("7. Eliminar Revisión de Mantenimiento");
        System.out.println("---------------------------------------------");
        System.out.println("8. Consultar Historial de Revisiones de Avión");
        System.out.println("---------------------------------------------");
        System.out.println("0. Volver al Menú Principal");
        System.out.println("=============================================");
        System.out.print("Seleccione una opción: ");

    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n======================================");
        System.out.println("             MENÚ PRINCIPAL           ");
        System.out.println("======================================");
        System.out.println("1. Gestión de Aviones");
        System.out.println("--------------------------------------");
        System.out.println("2. Gestión  de Tripulación");
        System.out.println("--------------------------------------");
        System.out.println("3. Gestión de Rutas y Escalas");
        System.out.println("--------------------------------------");
        System.out.println("4. Gestión de Aeropuertos");
        System.out.println("--------------------------------------");
        System.out.println("5. Gestión de Reservas");
        System.out.println("--------------------------------------");
        System.out.println("6. Gestión de Clientes");
        System.out.println("--------------------------------------");
        System.out.println("7. Gestión de Tarifas");
        System.out.println("--------------------------------------");
        System.out.println("8. Gestión de Documentos");
        System.out.println("--------------------------------------");
        System.out.println("9. Buscar y Reservar Vuelos (Clientes)");
        System.out.println("--------------------------------------");
        System.out.println("10. Consultas");
        System.out.println("--------------------------------------");
        System.out.println("0. Salir");
        System.out.println("======================================");
        System.out.print("Seleccione una opción: ");
    }
    

}

