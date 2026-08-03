package empresa.dados.AulasHEranca;

class AnimalHeranca {
    String nome;

    AnimalHeranca(String nome){
        this.nome = nome;
    }
}

class Cachorro1 extends AnimalHeranca {
    String raca;

    Cachorro1(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }
}
public class TestHerancaAnimal {
    public static void main(String[] args) {
        
        Cachorro1 dog = new Cachorro1("Rex", "Labrador");
        System.out.println("O nome do cachorro: " + dog.nome);
        System.out.println("A raca do cachorro: " + dog.raca);

    }
}
