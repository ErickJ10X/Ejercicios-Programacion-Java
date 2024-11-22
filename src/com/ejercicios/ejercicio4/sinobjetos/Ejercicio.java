package com.ejercicios.ejercicio4.sinobjetos;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menu;

        double area, lado, base, altura, apotema, perimetro;

        String contenidoMenu = """
                ******************
                
                Geometria 
                1 - Area de un cuadrado
                2 - Area de un triangulo
                3 - Area de un exagono
                4 - Area de rectangulo
                0 - Salir""";

        do {
            System.out.println(contenidoMenu);
            menu = leer.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Ingresar un lado del cuadrado: ");
                    lado = leer.nextDouble();
                    area = lado*lado;
                    System.out.println("El area del cuadrado es: " + area);
                case 2:
                    System.out.println("Ingresar base del Triangulo: ");
                    base = leer.nextDouble();
                    System.out.println("Ingresar altura del Triangulo: ");
                    altura = leer.nextDouble();
                    area = (base*altura)/2;
                    System.out.println("El area del triangulo es: " + area);
                case 3:
                    System.out.println("Ingresar perimetro del Exagono: ");
                    perimetro = leer.nextDouble();
                    System.out.println("Ingresar apotema del Exagono: ");
                    apotema = leer.nextDouble();
                    area = (perimetro * apotema)/2;
                    System.out.println("El area del exagono es: " + area);
                case 4:
                    System.out.println("Ingresar base del Rectangulo: ");
                    base = leer.nextDouble();
                    System.out.println("Ingresar altura del Rectangulo: ");
                    altura = leer.nextDouble();
                    area = base * altura;
                    System.out.println("El area del rectangulo es: " + area);
            }
        }while(menu!=0);
    }
}