package empresa.dados.ExercicioPersonagem;

public class Personagem {

    String nome;
    int nivelPoder;

    Personagem(String nome, int nivelPoder) {

        this.nome = nome;
        this.nivelPoder = nivelPoder;

    }

    public void tentarAumentarNivelPoder(int nivelPoder) {
        nivelPoder += 10;
    }

    public void mudarNome(Personagem personagem) {
        personagem.nome = "Guerreiro";
    }

    public void aumentarNivelPoder() {
        this.nivelPoder += 10;
    }

}

class PassagemPorParametrosRPG {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem("Mago", 50);

        System.out.println("**********************************************************************");

        System.out.println("Antes de Tentar Aumentar o nivel de poder: " + personagem1.nivelPoder);
        personagem1.tentarAumentarNivelPoder(personagem1.nivelPoder);
        System.out.println("Depois de Tentar Aumentar o nivel de poder: " + personagem1.nivelPoder);

        System.out.println("**********************************************************************");

        System.out.println("Antes de mudar de nome: " + personagem1.nome);
        personagem1.mudarNome(personagem1);
        System.out.println("Depois de mudar de nome: " + personagem1.nome);

        System.out.println("**********************************************************************");

        System.out.println("Antes de mudar o nivel de poder: " + personagem1.nivelPoder);
        personagem1.aumentarNivelPoder();
        System.out.println( "Depois de aumentar o nivel de poder: " + personagem1.nivelPoder);

        System.out.println("**********************************************************************");

    }
}
