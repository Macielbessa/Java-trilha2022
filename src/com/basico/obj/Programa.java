package com.basico.obj;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(2, "Joaquim Torres", "jtorres@gmail.com");
        Pessoa p3 = new Pessoa(3, "Ana Maria", "anamaria@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}