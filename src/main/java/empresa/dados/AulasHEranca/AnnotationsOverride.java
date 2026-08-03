package empresa.dados.AulasHEranca;

import java.lang.Override;

class SuperClasse {
    public void imprime() {
        System.out.println("Imprime");
    }
}

class MinhaClasse extends SuperClasse {
    @Override
    public void imprime() {
        System.out.println("Imprime Diferente");
    }

}

public class AnnotationsOverride {
    public static void main(String[] args) {
     MinhaClasse minhaClasse = new MinhaClasse();

     minhaClasse.imprime();
    }
}
