package com.ejercicios.ejercicio4.conobjetos.models;

import java.util.Scanner;

public class Menu {

    String contenidoMenu = """
                ******************
                
                Geometria 
                1 - Area de un cuadrado
                2 - Area de un triangulo
                3 - Area de un exagono
                4 - Area de rectangulo
                0 - Salir""";

    Scanner leer = new Scanner(System.in);
    int menu;
    double parametro1, parametro2;

    public void ejecutarMenu(){
        do{
            System.out.println(contenidoMenu);
            menu = leer.nextInt();

            switch (menu){
                case 1:
                    System.out.println("Ingresar un lado del cuadrado: ");
                    parametro1 = leer.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(parametro1);
                    System.out.println("El area del cuadrado es: " + cuadrado.area());
                case 2:
                    System.out.println("Ingresar base del Triangulo: ");
                    parametro1 = leer.nextDouble();
                    System.out.println("Ingresar altura del Triangulo: ");
                    parametro2 = leer.nextDouble();
                    Triangulo triangulo = new Triangulo(parametro1,parametro2);
                    System.out.println("El area del triangulo es: " + triangulo.area());
                case 3:
                    System.out.println("Ingresar perimetro del Exagono: ");
                    parametro1 = leer.nextDouble();
                    System.out.println("Ingresar apotema del Exagono: ");
                    parametro2 = leer.nextDouble();
                    Exagono exagono = new Exagono(parametro1, parametro2);
                    System.out.println("El area del exagono es: " + exagono.area());
                case 4:
                    System.out.println("Ingresar base del Rectangulo: ");
                    parametro1 = leer.nextDouble();
                    System.out.println("Ingresar altura del Rectangulo: ");
                    parametro2 = leer.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(parametro1,parametro2);
                    System.out.println("El area del rectangulo es: " + rectangulo.area());
            }
        }while(menu!=0);
    }
}