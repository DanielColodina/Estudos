package empresa.dados.ExercicioPessoa;

public class Aplicacao {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 20, "Rua A", 62331122);

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("************************************************************");

        pessoa.setIdade(32);
        System.out.println("Nova Idade: " + pessoa.getIdade());
        System.out.println("Endereco: " + pessoa.endereco);

        System.out.println("************************************************************");

        pessoa.setEndereco("Rua b");
        System.out.println("Novo endereco: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.telefone);

        System.out.println("************************************************************");

        pessoa.setTelefone(4323322);
        System.out.println("Novo Telefone: " + pessoa.telefone);

    }
}
