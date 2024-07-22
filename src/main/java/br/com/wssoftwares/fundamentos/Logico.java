package br.com.wssoftwares.fundamentos;

public class Logico {
    public static void main(String[] args) {
        // Operadores lógicos
        // && (AND) - E
        // || (OR) - OU
        // ! (NOT) - NÃO
        int age = 18;
        float salary = 1000f;
        boolean isAdult = age > 30 && salary > 3500;
        System.out.println("Is adult? " + isAdult);

        boolean isAdult2 = age > 30 || salary > 3500;
        System.out.println("Is adult? " + isAdult2);

        // not
        boolean isAdult3 = !(age > 30 || salary > 3500);
        System.out.println("Is adult? " + isAdult3);
    }
}
