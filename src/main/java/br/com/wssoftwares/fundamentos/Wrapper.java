package br.com.wssoftwares.fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        // Wrapper classes
        // em Java, os tipos primitivos não são objetos, mas existem classes que representam esses tipos primitivos
        // essas classes são chamadas de classes wrapper
        // byte
        Byte b = 127;
        // short
        Short s = 32767;
        // int
        Integer i = 2147483647;
        // long
        Long l = 9223372036854775807L;
        // float
        Float f = 3.4028235E38f;
        // double
        Double d = 1.7976931348623157E308;
        // char
        Character c = 'A';
        // boolean
        Boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
    }
}
