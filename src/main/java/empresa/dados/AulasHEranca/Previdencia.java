package empresa.dados.AulasHEranca;

class InformarRegras {


    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para aposentadoria!");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS regras para aposentadoria!");
    }
}

public class Previdencia {
    public static void main(String[] args) {
        InformarRegras informarRegras = new InformarRegras();

        //Uso do metodo Obsoleto
        informarRegras.mostrarRegrasParaAposentadoria();

        //Uso do Novo metodo
        informarRegras.mostrarNovasRegrasParaAposentadoria();
    }
}
