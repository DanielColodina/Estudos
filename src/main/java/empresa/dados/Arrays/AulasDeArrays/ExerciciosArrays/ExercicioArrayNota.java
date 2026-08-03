package empresa.dados.Arrays.AulasDeArrays.ExerciciosArrays;

public class ExercicioArrayNota {
    public static void main(String[] args) {

    //Declara o array
        double []nota;

        //Cria o array;
        nota = new double[5];
        nota[0] = 2;
        nota[1] = 3;
        nota[2] = 1;
        nota[3] = 6;
        nota[4] = 9;

            for (double notas : nota) {
                System.out.print( "[" + notas + "]");
        }
    }

}
