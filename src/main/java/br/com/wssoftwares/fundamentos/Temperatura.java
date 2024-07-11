package br.com.wssoftwares.fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double FATOR = 32;
        final double MULTIPLICADOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - FATOR) * MULTIPLICADOR;
        System.out.println("O valor em celsius é: " + celsius + "°C.");
    }
}
