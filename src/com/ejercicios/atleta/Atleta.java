package com.ejercicios.atleta;

public class Atleta {
    static int contador = 0;
    private int identificador;
    private String nombre;
    private double tiempo;
    static String seleccion = "Colombia";
    static double tiempoEquipo;

    // Constructor

    public Atleta(String nombre, double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.identificador = contador;
        contador++;
    }

    // metodos

    public void correr400Metros() {
        tiempoEquipo += tiempo;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo: " + tiempo);
        System.out.println("Identificador: " + identificador);
    }

    public void imprimirSeleccion() {
        System.out.println("Seleccion: " + seleccion);
    }

    public void imprimirTiempoEquipo() {
        System.out.println("Tiempo del equipo: " + tiempoEquipo);
    }
}
