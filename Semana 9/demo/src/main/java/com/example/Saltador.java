package com.example;

public class Saltador implements Atleta {
    private String nombre;
    private double alturaSalto;

    public Saltador(String nombre, double alturaSalto) {
        this.nombre = nombre;
        this.alturaSalto = alturaSalto;
    }

    @Override
    public double realizarCompetencia() {
        return alturaSalto * 100;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre);
        System.out.println("Deporte: Salto");
        System.out.println("Altura del Salto: " + alturaSalto + " metros");
    }
}
