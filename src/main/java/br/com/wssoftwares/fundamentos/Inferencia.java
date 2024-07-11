package br.com.wssoftwares.fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        // Inferência de tipos
        // var foi introduzido no Java 10 para inferir o tipo da variável de acordo com o valor atribuído
        var numero = Integer.parseInt("123456");
        var texto = "O número é: ";

        System.out.println(texto + numero);

        // Não é possível atribuir um valor de outro tipo a uma variável inferida
        // var numero2 = "123456";

        // Não é possível declarar uma variável sem atribuir um valor
        // var numero3;

        // Não é possível atribuir um valor nulo a uma variável inferida
        // var numero4 = null;

        double salario = 12345.67;

        System.out.println(salario);
    }
}
