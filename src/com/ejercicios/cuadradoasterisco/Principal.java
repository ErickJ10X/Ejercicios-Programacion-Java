package com.ejercicios.cuadradoasterisco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int alto;
        int ancho;
        String figura="";



        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar a altura del cuadrado:");
        alto = entrada.nextInt();
        System.out.println("Ingresar el ancho del cuadrado:");
        ancho = entrada.nextInt();
        for (int i = 1; i <= alto; i++) {
            for (int j = 1; j <= ancho; j++) {
                figura+=(i==1 || i==alto )?" * ":(j==1 || j==ancho)?" * ":"   ";
            }
            figura += "\n";
        }
        System.out.println(figura);
    }
}
