package empresa.dados;

public class TestStatic {
    public static void exibirValor(int a) {
        System.out.println("O valor do inteiro é: " + a);

    }

    public static void exibirValor(String str) {
        System.out.println("A String é: " + str);

    }

    public static void main(String[] args) {

        exibirValor("Olá");
        exibirValor(10);

    }

}
