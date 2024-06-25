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
                    manejarOpcionSubMenuCosultas();
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");              
            }

        } while (opcionPrincipal != 11);
    }

    private void manejarOpcionSubMenuCosultas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubMenuCosultas'");
    }

    private void mostrarSubMenuConsultas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuConsultas'");
    }

    private void manejarOpcionSubmenuBuscaryReservarVuelos(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuBuscaryReservarVuelos'");
    }

    private void mostrarSubMenuBuscaryReservarVuelos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuBuscaryReservarVuelos'");
    }

    private void manejarOpcionSubmenuDocumentos(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuDocumentos'");
    }

    private void mostrarSubMenuDocumentos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuDocumentos'");
    }

    private void manejarOpcionSubmenuTarifas(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuTarifas'");
    }

    private void mostrarSubMenuTarifas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuTarifas'");
    }

    private void manejarOpcionSubmenuClientes(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuClientes'");
    }

    private void mostrarSubMenuClientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuClientes'");
    }

    private void manejarOpcionSubmenuReservas(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuReservas'");
    }

    private void mostrarSubMenuReservas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuReservas'");
    }

    private void manejarOpcionSubmenuAeropuertos(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuAeropuertos'");
    }

    private void mostrarSubMenuAeropuertos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuAeropuertos'");
    }

    private void manejarOpcionSubmenuRutasyEscalas(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuRutasyEscalas'");
    }

    private void mostrarSubMenuRutasyEscalas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuRutasyEscalas'");
    }

    private void manejarOpcionSubmenuTripulacion(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuTripulacion'");
    }

    private void mostrarSubMenuTripulacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuTripulacion'");
    }

    private void manejarOpcionSubmenuAviones(int opcionSubMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'manejarOpcionSubmenuAviones'");
    }

    private void mostrarSubMenuAviones() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarSubMenuAviones'");
    }

    private void mostrarMenuPrincipal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMenuPrincipal'");
    }


}

