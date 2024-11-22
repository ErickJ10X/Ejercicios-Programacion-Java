package com.ejercicios.superheroe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Coleccion {
    private String nombreColeccion;
    private List<Figura> listaFiguras;

    //Constructors

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<Figura>();
    }

    //Getters & Setters

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    //Methods

    public void añadirFigura(Figura fig) {
        this.listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){
        int posicionFigura=0;
        for (int i = 0; i < listaFiguras.size(); i++) {
            if (listaFiguras.get(i).getCodigo().equals(id)) {
                posicionFigura = i;
            }
        }
        this.listaFiguras.get(posicionFigura).subirPrecio(cantidad);
    }

    public void conCapa(){
        listaFiguras.stream().filter(f -> f.getSuperheroe().isCapa()==true).forEach(f -> System.out.println(f.getSuperheroe()));
    }

    public void masValioso(){
        listaFiguras.stream().sorted(Comparator.comparing(Figura::getPrecio)).findFirst().ifPresent(f -> System.out.println(f));
    }

    public double getValorColeccion(){
        double valorTotal =0;
        for (Figura figura : listaFiguras) {
            valorTotal += figura.getPrecio();
        }
        return valorTotal;
    }

    public double getVolumenColeccion(){
        double volumenTotal =0;
        for (Figura figura : listaFiguras) {
            volumenTotal += figura.getDimension().getVolumen();
        }
        return volumenTotal;
    }
    //To String

    @Override
    public String toString() {
        return "Coleccion " + nombreColeccion + '\n' + listaFiguras;
    }
}
