package org.example.Exercicios;

public class LoopSomaLacos {
    public static void main(String[] args) {
        int numero = 10; // Exemplo de número inteiro positivo
        int soma = 0;
        // Calcula a soma dos números inteiros positivos
        do {
            soma += numero;
            numero--;
        } while (numero > 0);

        System.out.println("A soma dos números inteiros positivos é: " + soma);
    }
}


