package com.ejercicios.supermercado;

public class Vino implements EsLiquido, ConDescuento{
    private String marca;
    private String tipoDeVino;
    private double gradosDeAlcohol;
    private double precio;
    private double descuento;
    private double volumen;
    private String tipoEnvase;

    //constructor

    public Vino(String marca, String tipoDeVino, double gradosDeAlcohol, double precio) {
        this.marca = marca;
        this.tipoDeVino = tipoDeVino;
        this.gradosDeAlcohol = gradosDeAlcohol;
        this.precio = precio;
    }

    //Getters & Sestters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeVino() {
        return tipoDeVino;
    }

    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }

    public double getGradosDeAlcohol() {
        return gradosDeAlcohol;
    }

    public void setGradosDeAlcohol(double gradosDeAlcohol) {
        this.gradosDeAlcohol = gradosDeAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //To String

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipoDeVino='" + tipoDeVino + '\'' +
                ", gradosDeAlcohol=" + gradosDeAlcohol +
                ", precio=" + precio +
                '}';
    }

    //Methods interfaces

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
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }
}
