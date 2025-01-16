package com.ejercicios.asignatura;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura(1, "Mate", 5);
        Asignatura asignatura2 = new Asignatura(2, "Fisica", 5);
        asignatura.escribirsignatura();
        asignatura2.escribirsignatura();
        List<Asignatura> asignaturas = List.of(asignatura.leerAsignatura(), asignatura2.leerAsignatura());
        for (Asignatura asignatura1 : asignaturas) {
            asignatura1.imprimirAsignatura();
        }

    }
}
