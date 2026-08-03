package empresa.dados;


public class FolhaDePagamento {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Arnaldo", 6200.00);
        System.out.println(funcionario.obterInfo());

        System.out.println("-------------------------------------");

        funcionario.aumentarSalario(1000.00);
        System.out.println(funcionario.obterInfo());

        System.out.println("-----------Porcentagem---------------");

        funcionario.aumentarSalario(100);
        System.out.println(funcionario.obterInfo());
    }
}
