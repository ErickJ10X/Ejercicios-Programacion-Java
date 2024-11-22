package com.ejercicios.ejercicio4.conobjetos.models;

public class Cuadrado implements FigurasGeometricas{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }
}
