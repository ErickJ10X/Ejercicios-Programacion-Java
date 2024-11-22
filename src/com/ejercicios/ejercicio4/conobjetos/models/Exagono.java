package com.ejercicios.ejercicio4.conobjetos.models;

public class Exagono implements FigurasGeometricas{
    private double perimetro;
    private double apotema;

    public Exagono(double perimetro, double apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return (perimetro * apotema)/2;
    }
}
