package com.ejercicios.numeroperfecto;

public class Principal {
    public static void main(String[] args) {
        int numeroPerfecto = 28;
        int contador = 1;
        int verificacion = 0;
        do {
            if (numeroPerfecto%contador == 0) {
                verificacion+=contador;
                System.out.println(verificacion);
            }
            if (numeroPerfecto == verificacion) {
                System.out.println("el numero es perfecto");
            }else {
                contador++;
            }
        }while (numeroPerfecto != verificacion);
    }
}
