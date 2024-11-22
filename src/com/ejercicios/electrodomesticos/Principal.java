package com.ejercicios.electrodomesticos;

public class Principal {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico("Horno","xiomi", 10);

        electrodomestico.getConsumo(5);
        electrodomestico.getCosteConsumo(5,20);

        Lavadora lavadora = new Lavadora("xiomi", 10);
        lavadora.getConsumo(5);
        lavadora.getCosteConsumo(5,20);

        Lavadora lavadora2 = new Lavadora("xiomi", 1000, 10, true);
        lavadora2.getConsumo(5);
        lavadora2.getCosteConsumo(5,20);
    }
}
