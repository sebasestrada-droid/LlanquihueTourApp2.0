package model;

public class Guia {

    private String nombre;
    private String especialidad;
    private int experiencia;

    public Guia(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public String toString() {
        return nombre +
                " | Especialidad: " + especialidad +
                " | Experiencia: " + experiencia + " años";
    }
}