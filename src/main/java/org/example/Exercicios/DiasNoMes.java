package org.example.Exercicios;

public class DiasNoMes {
    public static void main(String[] args) {

        String mes = "Abril";

        switch (mes) {

            case "Janeiro" ->
                    System.out.println("Esse mes tem 20 dias");

            case "Fevereiro" ->
                    System.out.println("Esse mes tem 15 dias");

            case "Abril" ->
                    System.out.println("Esse mês tem 30 dias");

            default -> System.out.println("Desconhecido");
        }

    }
}
