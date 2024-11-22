package com.ejercicios.coche;

public class Principal {
    public static void main(String[] args) {
        Automovil cBoom = new Automovil("Toyota", 86, "23c", Tipo.NAFTA, 4, 180, "blanco",100);
        System.out.println(cBoom);
        cBoom.acelerar(20);
        cBoom.desacelerar(50);
        //cBoom.frenar();
        cBoom.calcularTiempoLlegada(1000);
    }
}
