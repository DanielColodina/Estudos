package empresa.Correcao.Heranca;

class Veiculo {
    void Acelerar() {
        System.out.println("Veiculo acelerando!");
    }
}

class Carro extends Veiculo {
    @Override
    void Acelerar() {
        System.out.println("Veiculo acelerando!");
        super.Acelerar();
    }
}

public class Main {
    public static void main(String[] args) {


        Carro cr = new Carro();

        cr.Acelerar();

    }
}
