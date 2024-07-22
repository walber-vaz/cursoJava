package br.com.wssoftwares.fundamentos;

public class LoopFor {
    public static void main(String[] args) {
        // Loop for - E a estrutura de repetição mais utilizada em Java
        // Sintaxe: for (inicialização; condição; incremento) { bloco de código }
        // Exemplo: for (int i = 0; i < 10; i++) { System.out.println(i); }
        // O loop for é composto por 3 partes:
        // 1. Inicialização: Inicializa a variável de controle do loop
        // 2. Condição: Define a condição para que o loop continue executando
        // 3. Incremento: Incrementa a variável de controle do loop

        int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
}
