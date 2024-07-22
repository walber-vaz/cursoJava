package br.com.wssoftwares.fundamentos;

public class LoopWhile {
    public static void main(String[] args) {
        // Loop while - enquanto a condição for verdadeira, o bloco de código será executado
        int contador = 0;
        // dentro dos parênteses, a condição que será avaliada e sempre vai retornar um valor booleano
        while (contador < 10) {
            System.out.printf("Contador: %d\n", ++contador);
        }
        
        // do while - executa o bloco de código pelo menos uma vez, mesmo que a condição seja falsa
        do {
            System.out.printf("Contador: %d\n", ++contador);
        } while (contador < 10);
    }
}
