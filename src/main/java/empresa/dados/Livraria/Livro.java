package empresa.dados.Livraria;

public class Livro {

    public String titulo;
    private String autor;
    protected int anoPublicacao;
    double preco;


    public Livro() {

        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0;
    }

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {

        this.titulo = titulo;
        this.autor =  autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;

    }
}
class Aplicacao {
    public static void main(String[] args) {

        System.out.println("************************************************************");

        Livro livro1 = new Livro();
        System.out.println("Titulo: " + livro1.titulo);
        System.out.println("Ano Publicacao: " + livro1.anoPublicacao);
        System.out.println("Preço: " + livro1.preco);

        System.out.println("************************************************************");

        Livro livro2 = new Livro("Senhor dos aneis", "George Well");
        System.out.println("Titulo: " + livro2.titulo);
        System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
        System.out.println("Preco: " + livro2.preco);

        System.out.println("************************************************************");

        Livro livro3 = new Livro("Tigresinha", "Fernanda Torres", 2013, 23.90);
        System.out.println("Titulo: " + livro3.titulo);
        System.out.println("Ano de Publicação: " + livro3.anoPublicacao);
        System.out.println("Preco: " + livro3.preco);

        System.out.print("************************************************************");
    }
}
