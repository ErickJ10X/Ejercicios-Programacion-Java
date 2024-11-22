package com.ejercicios.claseempleado;

public class Principal {
    public static void main(String[] args) {
        Empleados profesor = new Empleados("alexi", "calle sese", "almilla");
        Empleados tecnico = new Empleados("lucas", "sese", "zain");

        System.out.println(profesor);
        System.out.println(tecnico);

        var aux = profesor.getNombre();
        profesor.setNombre(tecnico.getNombre());
        tecnico.setNombre(aux);
        aux = profesor.getDireccion();
        profesor.setDireccion(tecnico.getDireccion());
        tecnico.setDireccion(aux);
        aux = profesor.getPoblacion();
        profesor.setPoblacion(tecnico.getPoblacion());
        tecnico.setPoblacion(aux);
        System.out.println("\n*****************Intercambio de datos********************\n   ");
        System.out.println(profesor);
        System.out.println(tecnico);
    }
}
