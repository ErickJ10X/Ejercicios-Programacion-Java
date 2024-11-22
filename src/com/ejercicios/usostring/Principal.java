package com.ejercicios.usostring;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String cadena = "En un lugar de la mnacha, de cuyo nombre no quiero acordarme, " +
                "no ha mucho timepo que vivia un hidalgo de los de lanza en astillero, adarga antigua, " +
                "rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, " +
                "duelos yh quebrantos los sábados, lentejas los viernes, ...";
        String menu = """
                1 - Cambiar caracter
                2 - mostrar parte de la cadena
                3 - eliminar de la cadena una palabra
                4 - buscar si existe una palabra
                5 - Transformar a mayuscula""";
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que caracter desea cambiar?");
                    String caracterCambiar = sc.nextLine();
                    System.out.println("por que caracter desea cambiar?");
                    String nuevoCaracter = sc.nextLine();
                    System.out.println(cadena.replace(caracterCambiar, nuevoCaracter));
                    break;
                case 2:
                    System.out.println("cuantos caracteres desea buscar?");
                    int cantCaracters = sc.nextInt();
                    System.out.println(cadena.substring(0, cantCaracters));
                    break;
                case 3:
                    System.out.println("que palabra desea eliminar?");
                    String eliminar = sc.nextLine();
                    System.out.println(cadena.replaceAll(eliminar, ""));
                    break;
            }
        }while (opcion!=0);
    }
}
