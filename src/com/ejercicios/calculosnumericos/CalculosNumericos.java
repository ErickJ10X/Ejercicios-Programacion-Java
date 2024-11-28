package com.ejercicios.calculosnumericos;

import java.util.Scanner;

public class CalculosNumericos {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println(calcularLogaritmo(10));
            System.out.println(calcularRaiz(15));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static double calcularLogaritmo(double num) {
        if (num > 0) {
            return Math.log(num);
        } else {
            throw new ArithmeticException("el valor debe ser positivo");
        }
    }

    public static double calcularRaiz(double num) {
        if (num > 0) {
            return Math.sqrt(num);
        } else {
            throw new ArithmeticException("el valor debe ser positivo");
        }
    }

    public static double calcularPendienteDeRecta(double x1, double x2, double y1, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static double calcularPunoMedioRecta(double x1, double x2, double y1, double y2) {
        return ((x1 + x2) / 2) + ((y1 + y2) / 2);
    }

    public void calcularCuadratica(){
        double resultado;
        System.out.println("Ingrese el valor de a:");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de b:");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de c:");
        double c = sc.nextDouble();
        System.out.println((-b+calcularRaiz((b*b)-4*a*c))/2*a);

    }
}
