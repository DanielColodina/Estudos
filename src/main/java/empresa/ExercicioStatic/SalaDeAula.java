package empresa.ExercicioStatic;

public class SalaDeAula {
    static int totalAlunos = 0;


   public static void adicionarAluno(){
       totalAlunos++;
   }
    public static void exibirTotalAlunos() {
        System.out.println("Total de Alunos na sala: " + totalAlunos);
    }

}

class TesteSalaDeAula {
    public static void main(String []args) {

        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula sala3 = new SalaDeAula();

        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();
        SalaDeAula.adicionarAluno();

        SalaDeAula.exibirTotalAlunos();


    }
}
