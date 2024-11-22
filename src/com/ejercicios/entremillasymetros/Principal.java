package com.ejercicios.entremillasymetros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mil, opcion;
        EntreMillasYMetros m = new EntreMillasYMetros();
        String menu = """
                Ingrese una opcion
                1 - Convertir millas a metros
                2 - Convertir millas a kilometros
                3 - salir del programa""";

        do {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de millas: ");
                    mil = sc.nextInt();
                    System.out.println(mil + " millas es " + m.millasAMetros(mil) + " metros");
                    break;
                case 2:
                    System.out.println("Ingrese el numero de millas: ");
                    mil = sc.nextInt();
                    System.out.println(mil + " millas es " + m.millasAKilometros(mil) + " kilometros");
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);

    }
}
