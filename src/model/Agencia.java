package model;

import java.util.ArrayList;

public class Agencia {

    private String nombre;
    private ArrayList<Tour> tours;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.tours = new ArrayList<>();
    }

    public void agregarTour(Tour tour) {
        tours.add(tour);
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public String getNombre() {
        return nombre;
    }
}