package br.com.wssoftwares.fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        // String é uma classe, por isso temos o operador "."
        String s = "Bom dia X";
        s = s.replace("X", "Senhor!");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String x = "w2k".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "w2k").toUpperCase().concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}
