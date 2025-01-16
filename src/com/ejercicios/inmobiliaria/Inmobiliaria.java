package com.ejercicios.inmobiliaria;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inmobiliaria {
    private List<Inmuebles> inmuebles = new ArrayList<>();

    public void agregarALista(Inmuebles inmueble) {
        inmuebles.add(inmueble);
    }

    public Inmuebles agregarInmueble () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar dirección del inmueble: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingresar ciudad del inmueble: ");
        String ciudad = scanner.nextLine();
        System.out.println("seleccionar tipo de inmueble: ");
        System.out.println("1. Arrriendo");
        System.out.println("2. venta");
        int opcion = scanner.nextInt();
        return new Inmuebles(direccion, ciudad, opcion == 1 ? Tipo.ARRIENDO : Tipo.VENTA);
    }

    public void editarLista(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la posición del inmueble a editar: ");
        int posicion = scanner.nextInt();
        Inmuebles inmueble = inmuebles.get(posicion);
        inmuebles.set(posicion, editarInmueble(inmueble));
    }

    public Inmuebles editarInmueble(Inmuebles inmueble) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar dirección del inmueble: ");
        String direccion = scanner.nextLine();
        System.out.println("Ingresar ciudad del inmueble: ");
        String ciudad = scanner.nextLine();
        System.out.println("seleccionar tipo de inmueble: ");
        System.out.println("1. Arrriendo");
        System.out.println("2. venta");
        int opcion = scanner.nextInt();
        inmueble.setDireccion(direccion);
        inmueble.setCiudad(ciudad);
        inmueble.setTipo(opcion == 1 ? Tipo.ARRIENDO : Tipo.VENTA);
        return inmueble;
    }

    public void eliminarDeLista(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la posición del inmueble a eliminar: ");
        int posicion = scanner.nextInt();
        inmuebles.remove(posicion);
    }

    public void guardarLista(){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("prueba.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Inmuebles inmueble : inmuebles) {
                objectOutputStream.writeObject(inmueble);
            }
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerLista(){
        Path path = Path.of("prueba.txt");
        if (!path.toFile().exists()) {
            return;
        }
        if (path.toFile().length() == 0) {
            return;
        }
        try{
            FileInputStream fileInputStream = new FileInputStream(path.toString());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Inmuebles inmueble;
            while (true) {
                try {
                    inmueble = (Inmuebles) objectInputStream.readObject();
                    inmuebles.add(inmueble);
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
            objectInputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void imprimirLista(){
        for (Inmuebles inmueble : inmuebles) {
            System.out.println("Dirección: " + inmueble.getDireccion());
            System.out.println("Ciudad: " + inmueble.getCiudad());
            System.out.println("Tipo: " + inmueble.getTipo());
        }
    }

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Agregar inmueble");
            System.out.println("2. Editar inmueble");
            System.out.println("3. Eliminar inmueble");
            System.out.println("4. Guardar lista");
            System.out.println("5. Leer lista");
            System.out.println("6. Imprimir lista");
            System.out.println("7. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarALista(agregarInmueble());
                    break;
                case 2:
                    editarLista();
                    break;
                case 3:
                    eliminarDeLista();
                    break;
                case 4:
                    guardarLista();
                    break;
                case 5:
                    leerLista();
                    break;
                case 6:
                    imprimirLista();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }
}
