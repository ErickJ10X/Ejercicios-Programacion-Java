package com.ejercicios.clasecoche;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        Coche pandaTrueno = new Coche("Toyota", " Blanco", 180);
        Coche porsche911 = new Coche("Porsche", " Gris", 220);

        System.out.println("Nuestros Coches son:");
        System.out.println(pandaTrueno);
        System.out.println(porsche911);

        pandaTrueno.aumentarVelocidad(80);
        System.out.println(pandaTrueno);
        porsche911.aumentarVelocidad(120);
        System.out.println(porsche911);

        pandaTrueno.disminuirVelocidad(20);
        System.out.println(pandaTrueno);
        porsche911.disminuirVelocidad(40);
        System.out.println(porsche911);

    }
}
