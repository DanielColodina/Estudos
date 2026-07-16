package org.example.Exercicios;

public class SwitchExpression {
    public static void main(String[] args) {

        String dia = "Ter.";
        String tipoDeDia = switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sext." -> "Dia util";
            case "Sabado", "Domingo" -> "Fim de semana";

            default -> "Desconhecido";
        };

        System.out.println(tipoDeDia);

    }
}
