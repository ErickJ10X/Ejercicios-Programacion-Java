package com.ejercicios.creacionclasepersona;

public class Principal {
    public static void main(String[] args) {
        Persona alguien = new Persona("Lucas", "Smilari", 12345,2001);
        Persona otraPersona = new Persona("Gabriel", "Carames", 54321,2001);

        System.out.println(alguien);
        System.out.println(otraPersona);
    }
}
