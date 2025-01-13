package com.ejercicios.cuentaconherencia;

public class CuentaCorriente extends Cuenta {
    private float saldoNegativo;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.saldoNegativo = 0;
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad > getSaldo()) {
            saldoNegativo += (cantidad - getSaldo());
            super.retirar(cantidad - getSaldo());
        } else {
            super.retirar(cantidad);
        }
    }

    @Override
    public void ingresar(float cantidad) {
        if (saldoNegativo > 0) {
            if (cantidad >= saldoNegativo) {
                cantidad -= saldoNegativo;
                saldoNegativo = 0;
            } else {
                saldoNegativo -= cantidad;
                cantidad = 0;
            }
        }
        super.ingresar(cantidad);
    }

    public void imprimir() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Saldo negativo: " + saldoNegativo);
        System.out.println("Número de transacciones: " + (getNumeroDeIngresos() + getNumeroDeRetiros()));
    }
}
