package com.ejercicios.supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
    private String marca;
    private double precio;
    private String tipoDeCereal;
    private LocalDate caducidad;

    //Constructor

    public Cereales(String marca, double precio, String tipoDeCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoDeCereal = tipoDeCereal;
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

    public String getTipoDeCereal() {
        return tipoDeCereal;
    }

    public void setTipoDeCereal(String tipoDeCereal) {
        this.tipoDeCereal = tipoDeCereal;
    }

    //Methods interfaces

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        switch (tipoDeCereal) {
            case "espelta":
                return 5;
            case "maiz":
                return 8;
            case "trigo":
                return 12;
            default:
                return 14;
        }
    }

    //To String

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoDeCereal='" + tipoDeCereal + '\'' +
                ", caducidad=" + caducidad +
                '}';
    }
}
