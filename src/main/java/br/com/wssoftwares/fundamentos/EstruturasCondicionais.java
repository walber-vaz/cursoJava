package br.com.wssoftwares.fundamentos;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // Estrutura condicional if
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Estrutura condicional ternario
        String resultado = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);
    }
}
