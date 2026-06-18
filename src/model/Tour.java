package model;

public class Tour {

    private String nombre;
    private String destino;
    private int participantes;
    private double precio;

    private Guia guia;
    private Transporte transporte;

    public Tour(String nombre,
                String destino,
                int participantes,
                double precio,
                Guia guia,
                Transporte transporte) {

        this.nombre = nombre;
        this.destino = destino;
        this.participantes = participantes;
        this.precio = precio;
        this.guia = guia;
        this.transporte = transporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public int getParticipantes() {
        return participantes;
    }

    public double getPrecio() {
        return precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    @Override
    public String toString() {

        return "\n==========================" +
                "\nTour: " + nombre +
                "\nDestino: " + destino +
                "\nParticipantes: " + participantes +
                "\nPrecio: $" + precio +
                "\nGuía: " + guia +
                "\nTransporte: " + transporte +
                "\n==========================";
    }
}