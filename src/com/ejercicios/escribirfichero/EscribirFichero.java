package com.ejercicios.escribirfichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class EscribirFichero {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println("Introduce el nombre del archivo a escribir: ");
        try {
            String nombreArchivo = reader.readLine();
            File archivo = new File(nombreArchivo);
            if(archivo.exists() && archivo.isFile()){
                System.out.println("Introduce el contenido del archivo: ");
                String contenido = reader.readLine();
                try {
                    FileWriter fileWriter = new FileWriter(archivo);
                    fileWriter.write(contenido);
                    fileWriter.close();
                } catch (Exception e) {
                    System.out.println("Error al escribir el archivo: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}
