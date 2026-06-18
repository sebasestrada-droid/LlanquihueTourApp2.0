package service;

import model.Tour;

import java.util.ArrayList;

public class ServicioTours {

    // Mostrar todos los tours
    public void mostrarTours(ArrayList<Tour> tours) {

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    // Buscar por nombre
    public void buscarTour(
            ArrayList<Tour> tours,
            String nombreBuscado) {

        boolean encontrado = false;

        for (Tour tour : tours) {

            if (tour.getNombre()
                    .equalsIgnoreCase(nombreBuscado)) {

                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {

            System.out.println(
                    "Tour no encontrado.");
        }
    }

    // Filtrar participantes
    public void filtrarParticipantes(
            ArrayList<Tour> tours,
            int minimo) {

        boolean encontrado = false;

        for (Tour tour : tours) {

            if (tour.getParticipantes() >= minimo) {

                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {

            System.out.println(
                    "No existen tours con esa cantidad.");
        }
    }

    // Estadísticas
    public void mostrarEstadisticas(
            ArrayList<Tour> tours) {

        if (tours.isEmpty()) {

            System.out.println(
                    "No existen tours cargados.");
            return;
        }

        int totalParticipantes = 0;

        Tour tourMasCaro = tours.get(0);
        Tour tourMayorParticipacion = tours.get(0);

        for (Tour tour : tours) {

            totalParticipantes +=
                    tour.getParticipantes();

            if (tour.getPrecio() >
                    tourMasCaro.getPrecio()) {

                tourMasCaro = tour;
            }

            if (tour.getParticipantes() >
                    tourMayorParticipacion
                            .getParticipantes()) {

                tourMayorParticipacion = tour;
            }
        }

        double promedio =
                (double) totalParticipantes /
                        tours.size();

        System.out.println(
                "\n===== ESTADISTICAS =====");

        System.out.println(
                "Cantidad de tours: "
                        + tours.size());

        System.out.println(
                "Promedio participantes: "
                        + promedio);

        System.out.println(
                "Tour mas caro: "
                        + tourMasCaro.getNombre());

        System.out.println(
                "Tour con mas participantes: "
                        + tourMayorParticipacion
                        .getNombre());
    }
}