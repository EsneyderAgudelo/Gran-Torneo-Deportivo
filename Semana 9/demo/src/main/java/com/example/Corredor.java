package com.example;

public class Corredor implements Atleta {
    private String nombre;
    private double tiempoCarrera;

    public Corredor(String nombre, double tiempoCarrera) {
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    @Override
    public double realizarCompetencia() {
        return 1000 / tiempoCarrera;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre);
        System.out.println("Deporte: Carrera");
        System.out.println("Tiempo de Carrera: " + tiempoCarrera + " segundos");
    }
}

