package com.ejercicios.atleta;

public class Principal {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Juan", 9.55);
        Atleta atleta2 = new Atleta("Pedro", 9.28);
        Atleta atleta3 = new Atleta("Maria", 9.33);
        Atleta atleta4 = new Atleta("Ana", 9.29);

        atleta1.correr400Metros();
        atleta2.correr400Metros();
        atleta3.correr400Metros();
        atleta4.correr400Metros();

        atleta1.imprimir();
        atleta1.imprimirSeleccion();
        atleta1.imprimirTiempoEquipo();
    }
}
