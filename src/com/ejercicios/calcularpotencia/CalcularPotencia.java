package com.ejercicios.calcularpotencia;

import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args) {

        //Atributos
        int base = 0;
        int exponente = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);

        //Toma de datos
        System.out.println("Ingresar la base:");
        base = sc.nextInt();
        assert base >= 0 && base <= 10 : "Assert: La base debe ser entre 0 y 10";//Assert para evitar que sea un numero entre 0 y 10
        System.out.println("Ingresar el exponente:");
        exponente = sc.nextInt();
        assert exponente >= 0 && exponente <= 20 : "Assert: El exponente debe ser entre 1 y 20";//Assert para evitar que sea un numero entre 0 y 20


        //try carch de conseguir la potencia
        try {
            resultado = potencia(base, exponente);
            System.out.println("El resultado de la potenciacion es: " + resultado);
        } catch (Exception | AssertionError e) {
            //mensage de error
            System.out.println(e.getMessage());
        }
    }

    //methodo para sacar la potencia
    public static int potencia(int base, int exponente) {

        int resultado = base;
        if (base < 0 || exponente < 0)//verifica que no sean numeros negativos
            throw new ArithmeticException("Los datos deben ser 0 o mayor que 0");//lanza una exception
        else if (exponente == 0 || base == 1)//si es exponente 0 entonces devuelte 1 o Si la base es 1 retorna 1
            return 1;
        else if (base > 1 && exponente > 0)//en caso de tener base mayor a 1 y exponente mayor a 0 itera el programa
            //bucle encargado de hacer la operacion
            for (int i = 1; i < exponente; i++) {
                resultado *= base;
                if (resultado * base > 1000)//si el resultao es mayor a 1000 se cierra el programa
                    break;
            }
        if (resultado <= 1000)//en caso de que el resultado sea menor a 1000 devuelve el resultado
            return resultado;
        else//caso contrario lanza una exception
            throw new ArithmeticException("El resultado es mayor que 1000. Finalizando el programa");
    }
}
