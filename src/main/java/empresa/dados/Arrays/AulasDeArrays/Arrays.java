package empresa.dados.Arrays.AulasDeArrays;

public class Arrays {
    public static void main(String[] args) {

        int[] meuArray;//Declara Array

        meuArray = new int[3]; //Cria Array
        meuArray[0] = 5;
        meuArray[1] = 2;
        meuArray[2] = 3;

        meuArray = new int[] {5,2,3};; //Cria e preenche Array

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        //Alterando elemento

        meuArray[0] = 10;

        System.out.println("Valor alterado do Array: " + meuArray[0]);

        //Pecorrendo Arrays
        for(int  i = 0; i < meuArray.length; i++) {

            System.out.println(meuArray[i]);
        }

    }
}
