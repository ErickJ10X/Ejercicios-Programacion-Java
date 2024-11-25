package com.ejercicios.breakcontnue;

public class Principal {
    public static void main(String[] args) {


        for (int i = 0; i < 50; i++) {
            if (!(i%3 == 0)) {
                if (i<=40){
                    System.out.println(i);
                }else {
                    System.out.println("se detuvo el bucle");
                    break;
                }
            }else {
                continue;
            }
        }
        for (int i = 41; i <= 50; i++) {
            if (!(i%3 == 0)) {
                System.out.println(i);
            }else {
                continue;
            }
        }
    }
}
