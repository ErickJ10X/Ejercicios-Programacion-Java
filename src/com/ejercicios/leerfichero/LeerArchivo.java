package com.ejercicios.leerfichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {

    public static void main(String[] args) throws FileNotFoundException {
        File fich = new File("C:\\Users\\Usuario\\Downloads\\ejercicio X\\src\\com\\ejercicios\\leerfichero\\prueba.txt");
        BufferedReader br = new BufferedReader(new FileReader(fich));
        String linea = "";
        try {
            while (linea != null) {
                linea = br.readLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
