package empresa.dados.Arrays.AulasDeArrays.ExerciciosArrays;

public class ExercicioSomaPares {
    public static void main(String[] args) {

        int tamanho = 6;
        int [] arraySeis = new int[tamanho];

        arraySeis[0] = 3;
        arraySeis[1] = 2;
        arraySeis[2] = 4;
        arraySeis[3] = 6;
        arraySeis[4] = 9;
        arraySeis[5] = 11;


            for (int tamanhoSeis : arraySeis) {
                    if (tamanhoSeis % 2 == 0) {

                        System.out.println("número par [" +tamanhoSeis+ "]");

            } else {
                        System.out.println("numero impar [" + tamanhoSeis +"]");
                    }
        }
    }
}
