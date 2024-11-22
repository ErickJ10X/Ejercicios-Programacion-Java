package com.ejercicios.creacionclasepersona;

public class Persona {
    String nombre;
    String apellido;
    int numeroDeIdentificacion;
    int anioDeNacimiento;

    public Persona(String nombre, String apellido, int numeroDeIdentificacion, int anioDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        this.anioDeNacimiento = anioDeNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " Numero de Identificacion: " + this.numeroDeIdentificacion + " Anio de Nacimiento: " + this.anioDeNacimiento;
    }

}
