package com.ejercicios.triangulo;

public class Triangulo {
    private double base;
    private double altura;

    //constructors

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Methods

    public double area(){
        return (base * altura)/2;
    }

    public double    perimetro(){
        return base+altura+conseguirHipotenusa();
    }

    public double conseguirHipotenusa(){
        double hipotenusa;
        hipotenusa = Math.sqrt((altura*altura)+(base*base));
        return hipotenusa;
    }

    public void tipoRectangulo(){
        if (base==altura && altura==conseguirHipotenusa()){
            System.out.println("Es un triangulo equilatero");
        } else if (base==altura || altura==conseguirHipotenusa() || base==conseguirHipotenusa()){
            System.out.println("Es un triangulo isoceles");
        } else {
            System.out.println("Es un triangulo escaleno");
        }
    }

    //Getters & Setters


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //ToString


    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
