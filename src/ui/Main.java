package ui;

import data.GestorDatos;
import model.Agencia;
import model.Tour;
import service.ServicioTours;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Agencia agencia =
                new Agencia("Llanquihue Tour");

        GestorDatos gestor =
                new GestorDatos();

        ArrayList<Tour> tours =
                gestor.cargarTours(
                        "resources/tours.txt");

        for (Tour tour : tours) {
            agencia.agregarTour(tour);
        }

        ServicioTours servicio =
                new ServicioTours();

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {

            try {

                System.out.println(
                        "\n====================");

                System.out.println(
                        " LLANQUIHUE TOUR ");

                System.out.println(
                        "====================");

                System.out.println(
                        "1. Mostrar Tours");

                System.out.println(
                        "2. Buscar Tour");

                System.out.println(
                        "3. Filtrar Participantes");

                System.out.println(
                        "4. Ver Estadisticas");

                System.out.println(
                        "5. Salir");

                System.out.print(
                        "Seleccione: ");

                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:

                        servicio.mostrarTours(
                                agencia.getTours());

                        break;

                    case 2:

                        System.out.print(
                                "Nombre del tour: ");

                        String nombre =
                                sc.nextLine();

                        servicio.buscarTour(
                                agencia.getTours(),
                                nombre);

                        break;

                    case 3:

                        System.out.print(
                                "Minimo participantes: ");

                        int minimo =
                                sc.nextInt();

                        servicio
                                .filtrarParticipantes(
                                        agencia.getTours(),
                                        minimo);

                        break;

                    case 4:

                        servicio
                                .mostrarEstadisticas(
                                        agencia.getTours());

                        break;

                    case 5:

                        System.out.println(
                                "Programa finalizado.");

                        break;

                    default:

                        System.out.println(
                                "Opcion invalida.");
                }

            } catch (Exception e) {

                System.out.println(
                        "Debe ingresar un numero.");

                sc.nextLine();
            }

        } while (opcion != 5);
    }
}