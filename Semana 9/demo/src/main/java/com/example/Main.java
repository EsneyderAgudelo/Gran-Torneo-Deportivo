package com.example;

public class Main {
    public static void main(String[] args) {
        Atleta corredor = new Corredor("Esneyder", 12.5);
        Atleta nadador = new Nadador("Leidy", 30.8);
        Atleta saltador = new Saltador("Mathias", 2.3);

        Torneo torneo = new Torneo();

        torneo.organizarCompetencia(corredor);
        torneo.organizarCompetencia(nadador);
        torneo.organizarCompetencia(saltador);
    }
}