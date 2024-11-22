package com.ejercicios.coche;

public class Automovil {
    private String marca;
    private int modelo;
    private String motor;
    private Tipo tipo;
    private int numPuertas;
    private int velMax;
    private String color;
    private int velocidad;

    //Constructors

    public Automovil(String marca, int modelo, String motor, Tipo tipo, int numPuertas, int velMax, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipo = tipo;
        this.numPuertas = numPuertas;
        this.velMax = velMax;
        this.color = color;
        this.velocidad = velocidad;
    }

    //Getters & Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
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

    public void acelerar(int velocidadAcelerar){
        if ((velocidadAcelerar + this.velocidad < velMax) && (velocidadAcelerar > 0)){
            this.velocidad += velocidadAcelerar;
            System.out.println("Aceleramos: " + velocidadAcelerar + " Km/h " + "Velocidad Actual: " + this.velocidad + "Km/h");
        } else if (velocidadAcelerar>=velMax){
            this.velocidad = velMax;
            System.out.println("Estamos a la velocidad maxima: " + this.velocidad + " Km/h");
        } else if (velocidadAcelerar < 1) {
            System.out.println("Tal vez te confundiste y querias desacelerar, no puedes acelerar con numeros negativos");
        }
    }
    public void desacelerar(int velocidadDesacelerar){
        if ((this.velocidad - velocidadDesacelerar> 0) && (velocidadDesacelerar < this.velMax)){
            this.velocidad -= velocidadDesacelerar;
            System.out.println("Desaceleramos: "+ velocidadDesacelerar + " Km/h " + "Velocidad Actual: " + this.velocidad+ " Km/h ");
        } else if (velocidadDesacelerar - this.velocidad < 0 || velocidadDesacelerar > this.velMax) {
            this.velocidad = 0;
            System.out.println("Frenamos");
        } else if (velocidadDesacelerar < 1) {
            System.out.println("Tal vez te confundiste no se puede desacelerar con numeros negativos");
        }
    }
    public void frenar(){
        this.velocidad = 0;
        System.out.println("Frenamos, velocidad Actual: " + this.velocidad + " Km/h");
    }
    public void calcularTiempoLlegada(int distancia){
        if (this.velocidad >0)
            System.out.println("Tiemo de llegada: " + distancia/velocidad);
        else
            System.out.println("El conche esta detenido");
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", motor='" + motor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numPuertas=" + numPuertas +
                ", velMax=" + velMax +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
