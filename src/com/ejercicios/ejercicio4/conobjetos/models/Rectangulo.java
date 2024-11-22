package com.ejercicios.ejercicio4.conobjetos.models;

public class Rectangulo implements FigurasGeometricas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double area() {
        return base * altura;
    }
}
