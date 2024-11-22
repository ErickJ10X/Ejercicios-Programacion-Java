package com.ejercicios.superheroe;

public class Figura {
    private String codigo;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;

    //Constructors

    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe) {
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }

    //Getters & Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    //To String

    @Override
    public String toString() {
        return "Codigo='" + codigo + '\n' +
                ", precio=" + precio + '\n' +
                ", dimension=" + dimension + '\n' +
                ", superheroe=" + superheroe;
    }

    //Methods

    public void subirPrecio(double cantidad){
        this.precio += cantidad;
    }
}
