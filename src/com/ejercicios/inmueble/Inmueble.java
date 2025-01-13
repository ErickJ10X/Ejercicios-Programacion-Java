package com.ejercicios.inmueble;

public class Inmueble {
    private int idInmobiliario;
    private int area;
    private String direccion;

    public Inmueble(int idInmobiliario, int area, String direccion) {
        this.idInmobiliario = idInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public double calcularPrecioVenta(double valorArea) {
        return 0;
    }

    public void imprimir() {
        System.out.println("ID: " + idInmobiliario);
        System.out.println("Area: " + area);
        System.out.println("Direccion: " + direccion);
    }
}
