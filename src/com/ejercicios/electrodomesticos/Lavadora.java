package com.ejercicios.electrodomesticos;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    //constructor

    public Lavadora(String marca, double potencia) {
        super(marca, potencia);
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente) {
        super(marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    //Getters & Setters

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    //To String

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

    //methods

    @Override
    public void getConsumo(int horas) {
        if (aguaCaliente) {
            System.out.println("Total de KW consumidos en " + horas + " horas: " + horas*(super.getPotencia() + (super.getPotencia()*0.20)) + " KW");
        } else {
            super.getConsumo(horas);
        }
    }
}
