package ExercicioCarro;

public class Carro {

    private String marcaDoCarro;
    private String modeloCarro;
    private int anoDoCarro;

    public Carro() {}

    public Carro(String marcaDoCarroInit, String modeloCarroInit) {

        marcaDoCarro = marcaDoCarroInit;
        modeloCarro = modeloCarroInit;

    }

    public Carro (String marcaDoCarroInit, String modeloCarroInit, int anoDoCarroInit) {

        marcaDoCarro = marcaDoCarroInit;
        modeloCarro = modeloCarroInit;
        anoDoCarro = anoDoCarroInit;

    }

    public void Exibir() {

        System.out.println("Construtor 1");
        System.out.println("Marca do Carro: " + marcaDoCarro);
        System.out.println("Modelo Carro: " + modeloCarro);

        System.out.println("--------------------------------");

        System.out.println("Construtor 2");
        System.out.println("Marca do Carro: " + marcaDoCarro);
        System.out.println("Modelo Carro: " + modeloCarro);
        System.out.println("Ano Carro: " + anoDoCarro);
    }
}
