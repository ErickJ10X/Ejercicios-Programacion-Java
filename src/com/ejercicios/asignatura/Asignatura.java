package com.ejercicios.asignatura;

import java.io.*;
import java.util.List;

public class Asignatura implements Serializable {
    private int codigoAsignatura;
    private String nombreAsignatura;
    private int creditos;

    public Asignatura(int codigoAsignatura, String nombreAsignatura, int creditos) {
        this.codigoAsignatura = codigoAsignatura;
        this.nombreAsignatura = nombreAsignatura;
        this.creditos = creditos;
    }

    public void escribirsignatura(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("prueba.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Asignatura leerAsignatura(){
        try {
            FileInputStream fileInputStream = new FileInputStream("prueba.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (Asignatura) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void imprimirAsignatura(){
        System.out.println("Codigo: " + this.codigoAsignatura);
        System.out.println("Nombre: " + this.nombreAsignatura);
        System.out.println("Creditos: " + this.creditos);
    }
}
