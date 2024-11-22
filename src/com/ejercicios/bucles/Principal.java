package com.ejercicios.bucles;

public class Principal {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumaMultiplos(10,20));
        numeroshasta10();
        numeroAmstrong(371);
    }

    public static String factorial(int num){
        String res = "\n"+ num + "! = ";
        int aux=1;
        for (int i = num; i >= 1; i--){
            aux=aux*i;
            if (i!=1)
                res += i + " X ";
            else
                res += i;
        }
        res += " = " + aux;
        return res;
    }

    public static int sumaMultiplos(int a, int b){
        int aux=0;
        for (int i = a; i < b; i++) {
            if (i % 5 == 0){
                aux+=i;
            }
        }
        return aux;
    }

    public static void numeroshasta10(){
        int aux=0;
        do {
            System.out.printf(" "+aux+" ");
            aux++;
        }while(aux!=10);
    }
    public static void numeroAmstrong(int num){
        String aux = "" + num;
        String res = num + " = ";
        int valorResultado = 0;
        for (int i = 0; i < aux.length(); i++) {
            int valoraux = Integer.parseInt(aux.substring(i,i+1));
            valorResultado+= Math.pow (valoraux,aux.length());
            res+= aux.charAt(i) + " ^ "+aux.length();
            if (i!=aux.length()-1){
                res+=" + ";
            }
        }
        res += " = " + valorResultado;
        System.out.println(res);
    }
}



