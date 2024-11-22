package com.ejercicios.electrodomesticos;

public class Electrodomestico {
    private String tipo;
    private String marca;
    private double potencia;

    //constructors

    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Electrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }
    //Getters & Setters

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //To String

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", potencia=" + potencia +
                '}';
    }

    //methods

    public void getConsumo(int horas){
        System.out.println("Total de KW consumidos en " + horas + " horas: " + horas*potencia + " KW");
    }

    public void getCosteConsumo(int horas, double costeHora){
        System.out.println("El coste total en " + horas + " horas: $" + horas*costeHora );
    }
}
