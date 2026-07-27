package org.example.Exercicios;

public class AprovacaoNotaPresenca {
    public static void main(String []args) {

        int nota1 = 6;
        int nota2 = 8;
        double frequencia = 70;

        double media = (nota1 + nota2)/2;

        boolean aprovado = media >= 7 && frequencia >= 75;

        if (aprovado) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }
}
