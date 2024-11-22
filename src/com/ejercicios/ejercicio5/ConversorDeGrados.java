package com.ejercicios.ejercicio5;

import java.util.Scanner;

public class ConversorDeGrados {
    public static void main(String[] args) {
        String mensaje = """
                Elije una opcion:
                1 - Celsius a Fahrenheit
                2 - Fahrenheit a Celsius
                3 - Salir""";
        Scanner leer = new Scanner(System.in);
        double grados = 0, solucion;
        int seleccion=0;



//        do {
//            System.out.println(mensaje);
//            seleccion = leer.nextInt();
//            switch (seleccion){
//                case 1:
//                    System.out.println("Ingrese un numero:");
//                    grados = leer.nextDouble();
//                    solucion =(grados*(9/5))+32;
//                    System.out.println(solucion);
//                case 2:
//                    System.out.println("Ingrese un numero:");
//                    grados = leer.nextDouble();
//                    solucion =(grados-32)/(9/5);
//                    System.out.println(solucion);
//                case 3:
//                    System.out.println("cerrando programa");;
//            }
//        }while(seleccion!=3);

        do {
            System.out.println(mensaje);
            seleccion = leer.nextInt();

            System.out.println("Ingrese un numero:");
            grados = leer.nextDouble();
            solucion = (seleccion == 1)?(grados*(9/5)+32):(grados-32)*(5/9);
            if (seleccion ==1 || seleccion == 2) System.out.println(solucion);
            else if (seleccion == 3) System.out.println("Cerrando programa");
            else System.out.printf("Opcion no valida");

        }while(seleccion!=3);
    }
}
