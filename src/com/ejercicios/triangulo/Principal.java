package com.ejercicios.triangulo;

public class Principal {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(5,5);
        System.out.println("area do triangulo: " + t.area());
        System.out.println("perimetro do triangulo: " + t.perimetro());
        System.out.println("hipotenusa de triangulo: " + t.conseguirHipotenusa());
        t.tipoRectangulo();
    }
}
