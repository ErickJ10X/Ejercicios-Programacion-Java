package com.ejercicios.vendedor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = sc.nextLine();
        Vendedor vendedor = new Vendedor(nombre, apellido);
        try {
            System.out.println("Ingrese el edad: ");
            edad = sc.nextInt();
            System.out.println(vendedor.verificarEdad(edad));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
