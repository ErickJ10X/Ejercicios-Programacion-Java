package com.ejercicios.clasecoche;

public class Coche {
    private String marca;
    private String color;
    private int velocidad;

    // Getters and Setters


    public Coche(String marca, String color, int velocidad) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Methods

    public void aumentarVelocidad(int velocidad) {
        this.velocidad += velocidad;
    }

    public void disminuirVelocidad(int velocidad) {
        if (this.velocidad - velocidad <= 0)
            System.out.println("No se puede bajar mas la velocidad");
        else
            this.velocidad -= velocidad;
    }

    //ToString

    @Override
    public String toString() {
        return "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad;
    }
}
