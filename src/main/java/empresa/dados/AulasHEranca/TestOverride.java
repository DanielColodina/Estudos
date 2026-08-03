package empresa.dados.AulasHEranca;

class Override {
    public String nome;
    public void fazerSom() {
        System.out.println("O animal fez Som");
    }
}

class CachorroOverride extends Override{
    public void fazerSom() {
        super.fazerSom();
        System.out.println("O animal não late");
    }
}

public class TestOverride{
    public static void main(String[] args) {

        CachorroOverride ch = new CachorroOverride();
        ch.nome = "Rex";
        System.out.println(ch.nome);
        ch.fazerSom();


    }
}
