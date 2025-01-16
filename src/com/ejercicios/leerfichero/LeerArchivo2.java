package com.ejercicios.leerfichero;

import java.io.*;

public class LeerArchivo2 {
    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        System.out.println("Introduce el nombre del archivo a buscar: ");
        try {
            String nombreArchivo = reader.readLine();
            File archivo = new File(nombreArchivo);
            System.out.println("Ruta absoluta del archivo: " + archivo.getAbsolutePath());
            if (archivo.exists() && archivo.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                    }
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo: " + e.getMessage());
                }
            } else {
                System.out.println("El archivo no existe o no es un archivo válido.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}
