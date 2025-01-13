package com.ejercicios.cuentaconherencia;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = (saldo>10000)? true : false;
    }

    @Override
    public void ingresar(float cantidad) {
        if (activa) {
            super.ingresar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede ingresar");
        }
    }

    @Override
    public void calcularComision() {
        if (getNumeroDeRetiros() > 4) {
            for (int i = 0; i <= getNumeroDeRetiros() - 4; i++) {
                setSaldo(getSaldo() - 1000);
            }
            if (activa){
                super.calcularComision();
            }
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva, no se puede retirar");
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("comisión mensual: " + getComisionMensual());
        System.out.println("Número de transacciones: " + (getNumeroDeIngresos()+getNumeroDeRetiros()));
    }
}
