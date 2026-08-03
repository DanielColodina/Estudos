package empresa.dados.AulasHEranca;

class Funcionario {
    private String nome;
    private double salario;
    private double aumentoFixo;


    public Funcionario(String nome, double salario, double aumentoFixo) {
        this.nome = nome;
        this.salario = salario;
        this.aumentoFixo = aumentoFixo;
    }

    public String Info() {
        return "Nome:" + getNome() +
                " Salario: " + getSalario() +
                " Aumento: " + getaumentoFixo();
    }

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

    public double getaumentoFixo(){
        return aumentoFixo;
    }

    public void setaumentoFixo(double aumentoFixo) {
        this.aumentoFixo = aumentoFixo;
    }

}

class Assistente extends Funcionario{
    double AumentoSalario;

    public  Assistente(String nome, double salario, double aumentoFixo) {
        super(nome, salario, aumentoFixo);
        AumentoSalario = getSalario() + getaumentoFixo();
    }
}

public class TesteHeranca {
    public static void main(String[] args) {

        Assistente ObjAssistente = new Assistente("Bruno", 3000, 500);

        System.out.println(ObjAssistente.Info());

        System.out.println("***************************************************");

        System.out.println("Nome: " + ObjAssistente.getNome());
        System.out.println("Salario: " + ObjAssistente.getSalario());
        System.out.println("Salario + Aumento: " + ObjAssistente.AumentoSalario);

    }
}
