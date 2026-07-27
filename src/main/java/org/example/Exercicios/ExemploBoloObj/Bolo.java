package org.example.Exercicios.ExemploBoloObj;

public class Bolo {

    int quantidadeAcucar;

    public static void main(String[] args) {

        Bolo BoloDeChocolate = new Bolo();
        BoloDeChocolate.quantidadeAcucar = 200;


        Bolo BoloDeBaunilha = new Bolo();
        BoloDeBaunilha.quantidadeAcucar = 150;

        System.out.println("Chocolate "+ BoloDeChocolate.quantidadeAcucar);
        System.out.println("Baunilha " + BoloDeBaunilha.quantidadeAcucar);
    }
}
