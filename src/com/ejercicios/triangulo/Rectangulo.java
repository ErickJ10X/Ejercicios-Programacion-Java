package com.ejercicios.triangulo;

public class Rectangulo {
    private int base;
    private int altura;

    //constructors

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //methods

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2*(base+altura);
    }
}
