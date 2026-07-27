package org.example.Exercicios.Funcionarios;

public class Funcionario {

    String nome;
    String cargo;
    int idade;

    Funcionario(String nome, String cargo, int idade) {

        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    public static void main(String []args) {

        Funcionario funcionario = new Funcionario("joão", "Dev",30);

        /*

        funcionario.nome = "João";
        funcionario. cargo = "Desenvolvedor";
        funcionario.idade = 24;

        */

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
    }
}
