package com.ejercicios.vendedor;

public class Vendedor {
    private String nombre;
    private String apellido;
    private int edad;

    //Constructors

    public Vendedor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //To String - Imprimir
    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    //Methods

    public String verificarEdad (int edad) {
        if (edad >= 18) {
            if (edad>=0 && edad <= 120) {
                this.edad = edad;
                return "La edad cumple con los requerimientos y fue cargada correctamente";
            }else {
                throw new IllegalArgumentException("El edad no puede ser negativa ni mayor a 120");
            }
        }else {
            throw new IllegalArgumentException("El edad debe ser mayor que 18");
        }
    }
}
