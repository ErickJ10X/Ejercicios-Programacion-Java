package com.ejercicios.claseplaneta;

public class Principal {
    public static void main(String[] args) {
        Planeta jupiter = new Planeta("Jupiter",21, 10,10,10, 750000000, TipoPlaneta.GASEOSO, true);
        Planeta saturno = new Planeta("Saturno",21, 10,10,10, 1418000000, TipoPlaneta.GASEOSO, true);

        System.out.println("La densidad de " + jupiter.getNombre() + " es " + jupiter.calcularDensidad());
        System.out.println("La densidad de " + saturno.getNombre() + " es " + saturno.calcularDensidad());
    }
}
