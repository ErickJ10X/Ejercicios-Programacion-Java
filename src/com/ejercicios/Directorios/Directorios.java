package com.ejercicios.Directorios;

import java.io.File;
import java.nio.file.Path;

public class Directorios {
    public static void main(String[] args) {
        Path path = Path.of("src/com/ejercicios");
        System.out.println("Ruta absoluta del directorio: " + path.toAbsolutePath());
        File directorio = new File(path.toString());
        if (directorio.exists() && directorio.isDirectory()) {
            System.out.println("Contenido del directorio:");
            for (String nombre : directorio.list()) {
                System.out.println("Archivo: "+ nombre);
            }
        } else {
            System.out.println("El directorio no existe o no es un directorio válido.");
        }
    }
}
