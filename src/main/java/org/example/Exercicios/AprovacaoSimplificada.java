package org.example.Exercicios;

public class AprovacaoSimplificada {

    public static void main(String []args) {

        double nota1 = 3;
        double nota2 = 2;

        double media = (nota1 + nota2)/2;

        String ternario = (media >= 6) ?
        "Aprovado" : "Reprovado";

        System.out.println(ternario);
    }
}
