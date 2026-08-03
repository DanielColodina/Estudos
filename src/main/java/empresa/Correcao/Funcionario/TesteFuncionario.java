package empresa.Correcao.Funcionario;

class Funcionario {
    private String nome;
    private double salario;

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

class Assistente extends Funcionario {

    private int numeroMatricula;

    public double ganhoAnual() {
        return  super.ganhoAnual() + 100; //Ganho fixo para Assistente
    }
}

public class TesteFuncionario {
    public static void main(String[] args) {

        Assistente assistente  = new Assistente();

        assistente.addAumento(500);
        assistente.setNome("jonas");
        assistente.setSalario(3000);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: R$" + assistente.ganhoAnual());


    }
}
