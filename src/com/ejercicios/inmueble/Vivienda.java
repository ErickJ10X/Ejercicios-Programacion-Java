package com.ejercicios.inmueble;

public class Vivienda extends Inmueble {
    private int numeroDeHabitaciones;
    private int numeroDeBaños;

    public Vivienda(int idInmobiliario, int area, String direccion, int numeroDeHabitaciones, int numeroDeBaños) {
        super(idInmobiliario, area, direccion);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.numeroDeBaños = numeroDeBaños;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de habitaciones: " + numeroDeHabitaciones);
        System.out.println("Numero de baños: " + numeroDeBaños);
    }
}
