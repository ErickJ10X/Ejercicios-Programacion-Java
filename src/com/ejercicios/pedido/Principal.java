package com.ejercicios.pedido;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.calcularPedido("Chuleton",100, "Cerveza",50);
        pedido.calcularPedido("Crema de verduras", 100, "Churrasco", 100,"cerveza",50);
        pedido.calcularPedido("Crema de espinacas", 100, "Salmon", 100,"Tiramisu",50,"aquarius", 50);

    }
}
