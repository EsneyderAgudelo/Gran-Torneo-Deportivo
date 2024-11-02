package com.example;

public class Torneo {

    public void organizarCompetencia(Atleta atleta) {
        System.out.println("Iniciando competencia...");
        atleta.mostrarInformacion();
        
        double puntaje = atleta.realizarCompetencia();
        System.out.println("Puntaje obtenido: " + puntaje);
        System.out.println("-----------------------------------");
    }
}

