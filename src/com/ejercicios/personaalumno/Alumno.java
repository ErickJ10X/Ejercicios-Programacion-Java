package com.ejercicios.personaalumno;

public class Alumno extends Persona {
    private double nota;

    public Alumno(String nombre, int edad, double nota) {
        super(nombre, edad);
        this.nota = nota;
    }
}
