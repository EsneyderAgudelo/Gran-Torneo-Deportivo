package com.example;

public class Nadador implements Atleta {
    private String nombre;
    private double tiempoNatacion;

    public Nadador(String nombre, double tiempoNatacion) {
        this.nombre = nombre;
        this.tiempoNatacion = tiempoNatacion;
    }

    @Override
    public double realizarCompetencia() {
        return 1000 / tiempoNatacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre);
        System.out.println("Deporte: Natación");
        System.out.println("Tiempo de Natación: " + tiempoNatacion + " segundos");
    }
}
