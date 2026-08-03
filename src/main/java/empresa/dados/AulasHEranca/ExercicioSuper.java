package empresa.dados.AulasHEranca;

class Veiculo{
    public void acelerar() {
        System.out.println("Veiculo acelerando");
    }
}

class Carro extends Veiculo{
    public void acelerar() {
        super.acelerar();
        System.out.println("Veiculo acelerando");
    }
}


public class ExercicioSuper {
    public static void main(String[] args) {

        Carro cr = new Carro();

        cr.acelerar();
    }

}
