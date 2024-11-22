package com.ejercicios.ejercicio3;

import java.util.Scanner;

public class principal {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double velocidad, distancia, tiempo;

        System.out.println("Ingresar la velocidad:");
        velocidad = leer.nextDouble();
        System.out.println("Ingresar la distancia:");
        distancia = leer.nextDouble();
        tiempo = distancia/velocidad;
        System.out.println("Para la distancia " + distancia
                + " y la velocidad " + velocidad + "el tiempo es " + tiempo);

    }
}
