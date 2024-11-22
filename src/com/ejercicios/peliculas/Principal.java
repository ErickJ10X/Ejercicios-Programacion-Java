package com.ejercicios.peliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Genero> generosThor = new ArrayList<>();
        generosThor.add(Genero.ACCION);
        generosThor.add(Genero.COMEDIA);
        generosThor.add(Genero.SUSPENSO);
        List<Genero> generosGrandhi = new ArrayList<>();
        generosGrandhi.add(Genero.DRAMA);
        generosGrandhi.add(Genero.SUSPENSO);
        generosGrandhi.add(Genero.COMEDIA);
        Pelicula p1 = new Pelicula("Grandhi", "Richard Attenborough", generosGrandhi, 191, 1982, 8.1);
        Pelicula p2 = new Pelicula("Thor", "Kenneth Branagh", generosThor, 115, 2011, 7.0);
        Pelicula p3 = new Pelicula("Ghor", "Kenneth Branagh", generosThor, 115, 2011, 7.0);
        List<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        int opcion;
        Scanner sc = new Scanner(System.in);
        String menu = """
                menu
                1 - Ver peliculas epicas
                2 - ver valoracion de peliculas
                3 - Determinar sin son peliculas similares
                4 - Mostrar peliculas
                
                0 - salir""";

        do {
            System.out.println(menu);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    peliculas.stream().filter(p -> p.esPeliculaEpica()).forEach(System.out::println);
                    break;
                case 2:
                    peliculas.forEach(p -> System.out.println(p.getNombre() + ": " + p.calcularValoracion()));
                    break;
                case 3:
                    System.out.println("indicar el nombre de la pelicula que desea comparar: ");
                    String nombre = sc.next();
                    System.out.println("indicar el nombre de la pelicula con la que va comparar: ");
                    String nombre2 = sc.next();
                    Pelicula peliculaComparar = null;
                    Pelicula peliculaComparar2 = null;
                    for (Pelicula p : peliculas) {
                        if (p.getNombre().toLowerCase().equals(nombre)) {
                            peliculaComparar = p;
                        }
                        if (p.getNombre().toLowerCase().equals(nombre2)) {
                            peliculaComparar2 = p;
                        }
                    }
                    if (peliculaComparar.esSimilar(peliculaComparar2)) {
                        System.out.println("La pelicula es similar");
                    } else {
                        System.out.println("La pelicula no es similar");
                    }
                    break;
                case 4:
                    peliculas.forEach(p -> p.imprimirCartel());
                    break;
            }
        } while (opcion != 0);
    }
}
