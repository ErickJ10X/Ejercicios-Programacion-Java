package com.ejercicios.cuentaconherencia;

public class Cuenta {
    private float saldo;
    private int numeroDeIngresos = 0;
    private int numeroDeRetiros = 0;
    private float tasaAnual;
    private float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void ingresar(float cantidad) {
        saldo += cantidad;
        numeroDeIngresos++;
    }

    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            System.out.println("No se puede retirar esa cantidad, saldo insuficiente");
            return;
        }else {
            saldo -= cantidad;
            numeroDeRetiros++;
        }

    }

    public void calcularInteres() {
        comisionMensual = saldo * tasaAnual / 12;
        saldo += comisionMensual;
    }

    public void calcularComision() {
        saldo -= comisionMensual;
        calcularInteres();
    }

    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de ingresos: " + numeroDeIngresos);
        System.out.println("Número de retiros: " + numeroDeRetiros);
    }

    public float getSaldo() {
        return saldo;
    }

    public int getNumeroDeIngresos() {
        return numeroDeIngresos;
    }

    public int getNumeroDeRetiros() {
        return numeroDeRetiros;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
