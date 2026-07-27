package org.example.Exercicios;

public class LoopContagenDoces {
    public static void main(String[] args) {

        int contadorDoces = 2;
        boolean condicaoMae = false;


        while(true) {

            if (contadorDoces <= 3 && condicaoMae == true) {
                System.out.println("Ele pode comer o doce dele!");
            } else {
                System.out.println("Ele não pode comer o doce dele!!");
            }

            break;
        }
    }
}
