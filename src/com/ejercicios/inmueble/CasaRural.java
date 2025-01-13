package com.ejercicios.inmueble;

public class CasaRural extends Casa{
    private double valorArea;
    private int distanciaCabera;
    private int altitud;

    public CasaRural(int idInmobiliario, int area, String direccion, int numeroDeHabitaciones, int numeroDeBaños, int numeroDePisos, double valorArea, int distanciaCabera, int altitud) {
        super(idInmobiliario, area, direccion, numeroDeHabitaciones, numeroDeBaños, numeroDePisos);
        this.valorArea = valorArea;
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor del area: " + valorArea);
        System.out.println("Distancia a la cabecera: " + distanciaCabera);
        System.out.println("Altitud: " + altitud);
    }
}
