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

        // Estrutura condicional switch
        int opcao = 2;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1");
                break;
            case 2:
                System.out.println("Opção 2");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
