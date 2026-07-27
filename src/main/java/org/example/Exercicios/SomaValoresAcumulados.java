package org.example.Exercicios;

public class SomaValoresAcumulados {
    public static void main(String[] args) {


        int soma = 0;

        System.out.println("***************************************************");

        for(int i = 1; i <= 10; i++) {

            soma  =  i + 1;
            System.out.println(i + "° Interação "+soma+ " soma");
            System.out.println("***************************************************");

        }
    }
}
