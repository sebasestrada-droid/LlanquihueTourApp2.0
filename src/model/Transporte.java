package model;

public class Transporte {

    private String tipo;
    private int capacidad;

    public Transporte(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return tipo +
                " (Capacidad: " +
                capacidad +
                " pasajeros)";
    }
}
