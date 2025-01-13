package com.ejercicios.inmueble;

public class Casa extends Vivienda {
    private int numeroDePisos;

    public Casa(int idInmobiliario, int area, String direccion, int numeroDeHabitaciones, int numeroDeBaños, int numeroDePisos) {
        super(idInmobiliario, area, direccion, numeroDeHabitaciones, numeroDeBaños);
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos: " + numeroDePisos);
    }
}
