package com.ejercicios.claseplaneta;

public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0;
    private double volumen = 0;
    private double diametro = 0;
    private int distanciaSol = 0;
    private TipoPlaneta tipoPlaneta;
    private boolean observable = false;

    //Constructors

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, int distanciaSol, TipoPlaneta tipoPlaneta, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSatelites() {
        return cantidadSatelites;
    }

    public void setCantidadSatelites(int cantidadSatelites) {
        this.cantidadSatelites = cantidadSatelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public TipoPlaneta getTipoPlaneta() {
        return tipoPlaneta;
    }

    public void setTipoPlaneta(TipoPlaneta tipoPlaneta) {
        this.tipoPlaneta = tipoPlaneta;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    //Methods

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", cantidadSatelites=" + cantidadSatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", tipoPlaneta=" + tipoPlaneta +
                ", observable=" + observable;
    }

    public double calcularDensidad(){
        return this.masa / this.volumen;
    }
    public boolean determinarPlanetaExterior(){
        int uA = 149597870;
        if (this.distanciaSol >= uA*3.4){
            return true;
        } else {
            return false;
        }
    }
}

