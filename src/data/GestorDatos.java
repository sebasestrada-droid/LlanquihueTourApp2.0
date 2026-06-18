package data;

import model.Guia;
import model.Tour;
import model.Transporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String archivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader lector =
                     new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombreTour = datos[0];
                String destino = datos[1];
                int participantes = Integer.parseInt(datos[2]);
                double precio = Double.parseDouble(datos[3]);

                String nombreGuia = datos[4];
                String especialidad = datos[5];
                int experiencia = Integer.parseInt(datos[6]);

                String tipoTransporte = datos[7];
                int capacidad = Integer.parseInt(datos[8]);

                Guia guia = new Guia(
                        nombreGuia,
                        especialidad,
                        experiencia);

                Transporte transporte = new Transporte(
                        tipoTransporte,
                        capacidad);

                Tour tour = new Tour(
                        nombreTour,
                        destino,
                        participantes,
                        precio,
                        guia,
                        transporte);

                tours.add(tour);
            }

        } catch (Exception e) {

            System.out.println(
                    "Error al leer archivo: "
                            + e.getMessage());
        }

        return tours;
    }
}
