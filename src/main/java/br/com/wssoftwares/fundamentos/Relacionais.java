package br.com.wssoftwares.fundamentos;

public class Relacionais {
    public static void main(String[] args) {
        // Operadores relacionais
        // % = resto da divisão poder usar para saber se um número é par ou ímpar por exemplo
        // se o resto da divisão por 2 for 0 é par, se for 1 é ímpar
        int resto = 10 % 2;
        System.out.printf("Resto da divisão de 10 por 2 é %d\n", resto);

        // < menor que > maior que <= menor ou igual >= maior ou igual == igual != diferente
        boolean isPar = 10 % 2 == 0;
        boolean isImpar = 10 % 2 != 0;
        System.out.printf("10 é par? %b\n", isPar);
        System.out.printf("10 é ímpar? %b\n", isImpar);
        System.out.printf("10 é menor que 5? %b\n", 10 < 5);
        System.out.printf("10 é maior que 5? %b\n", 10 > 5);
        System.out.printf("10 é menor ou igual a 5? %b\n", 10 <= 5);
        System.out.printf("10 é maior ou igual a 5? %b\n", 10 >= 5);
        System.out.printf("10 é igual a 5? %b\n", 10 == 5);
        System.out.printf("10 é diferente de 5? %b\n", 10 != 5);
    }
}
