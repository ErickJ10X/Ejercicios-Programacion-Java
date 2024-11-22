package com.ejercicios.convertirminutos;

import java.util.Scanner;

public class ConvertirMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos;
        double anios, dias;


        System.out.println("Ingrese los minutos que desea convertir:");
        minutos = scanner.nextInt();

        dias = minutos / 1440;
        anios = minutos / 525600;

        System.out.println("Son " + (int) dias + " dias");
        System.out.println("Son " + (int) anios + " años");
        System.out.println("Son años: " + (int) anios + " dias: " + (int) ((minutos%525600)/1440));

    }
}
