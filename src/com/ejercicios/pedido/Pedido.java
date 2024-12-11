package com.ejercicios.pedido;

public class Pedido {
    public void calcularPedido(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida) {
        String pedido = """
                ********Pedido********
                %s : $%s
                %s : $%s
                Total : $%s
                **********************\n""".formatted(primerPlato, costoPrimerPlato, bebida, costoBebida, (costoBebida + costoPrimerPlato));
        System.out.println(pedido);
    }

    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlatao, double costoSegundoPlato, String bebida, double costoBebida) {
        String pedido = """
                ********Pedido********
                %s : $%s
                %s : $%s
                %s : $%s
                Total : $%s
                **********************\n""".formatted(primerPlato, costoPrimerPlato, segundoPlatao, costoSegundoPlato, bebida, costoBebida, (costoBebida + costoPrimerPlato + costoSegundoPlato));
        System.out.println(pedido);
    }

    public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlatao, double costoSegundoPlato, String postre, double costoPostre, String bebida, double costoBebida) {
        String pedido = """
                ********Pedido********
                %s : $%s
                %s : $%s
                %s : $%s
                %s : $%s
                Total : $%s
                **********************\n""".formatted(primerPlato, costoPrimerPlato, segundoPlatao, costoSegundoPlato, postre, costoPostre, bebida, costoBebida, (costoBebida + costoPrimerPlato + costoSegundoPlato + costoPostre));
        System.out.println(pedido);
    }
}

