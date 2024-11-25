package com.ejercicios.numerosamigos;

public class Principal {
    public static void main(String[] args) {
        numerosAmigos(28, 28);
    }

    public static void numerosAmigos(int a, int b){
        int sumaDivisoresA=0;
        int sumaDivisoresB=0;
        String divisoresA="";
        if (a>0 && b>0){
            for (int i = 1; i < a; i++) {
                if (a%i == 0)
                    sumaDivisoresA+=i;
            }

            for (int i = 1; i < b; i++) {
                if (b%i == 0)
                    sumaDivisoresB+=i;
            }
            if (sumaDivisoresA == b && sumaDivisoresB == a){
                System.out.println("son numeros amigos");
            } else {
                System.out.println("no son numeros amigos");
            }
        }else {
            System.out.println("tienen que ser numeros positivos");
        }

    }
}
