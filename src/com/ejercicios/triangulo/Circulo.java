package com.ejercicios.triangulo;

public class Circulo {
    private int radio;

    //constructor

    public Circulo(int radio) {
        this.radio = radio;
    }

    //methods

    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
