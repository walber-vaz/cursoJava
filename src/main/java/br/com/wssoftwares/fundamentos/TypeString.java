package br.com.wssoftwares.fundamentos;

public class TypeString {
    public static void main(String[] args) {
        // charAt -> Retorna o caractere na posição especificada
        String s = "Java";
        System.out.println(s.charAt(0));
        // concat -> Concatena duas strings
        System.out.println(s.concat(" é uma linguagem de programação"));
        // startsWith -> Verifica se a string começa com um prefixo
        System.out.println(s.startsWith("Ja"));
        // endsWith -> Verifica se a string termina com um sufixo
        System.out.println(s.endsWith("va"));
        // length -> Retorna o tamanho da string
        System.out.println(s.length());
        // equals -> Compara duas strings case sensitive
        System.out.println(s.equals("Java"));
        // equalsIgnoreCase -> Compara duas strings sem levar em consideração o case
        System.out.println(s.equalsIgnoreCase("java"));

        var nome = "Jhon";
        var sobrenome = "Doe";
        var idade = 33;
        var salario = 5000.00;

        // Formatação de strings com printf -> %s (string), %d (inteiro), %f (float)
        System.out.printf("Nome: %s %s, Idade: %d, Salário: %.2f", nome, sobrenome, idade, salario);
    }
}
