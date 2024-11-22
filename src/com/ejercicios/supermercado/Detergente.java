package com.ejercicios.supermercado;

public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double descuento;
    private double volumen;
    private String tipoEnvase;

    //constructor

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    //Getters & Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Methods Interfaces

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public double getPrecioDescuento() {
        return precio * (100/descuento);
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    //To String

    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                '}';
    }
}
