package org.example.Exercicios;

public class ParImparTernario {
    public static void main(String [] args) {

        int numero = 4;

        String resultado = (numero % 2 == 0 ) ? "par" : "impar";

        System.out.println("numero é " + resultado);
    }
}
