package empresa.dados.AulasHEranca;

import java.lang.Override;

class Animal2 {
    public void fazerSom() {
        System.out.println("Late, Late");
    }
}

class Cachorro2 extends Animal2{
    @Override
    public void fazerSom() {
        System.out.println("Latiu, Latiu");
    }
}

public class TestAnnotations {
    public static void main(String[] args) {
     Cachorro2 cachorro2 = new Cachorro2();
     cachorro2.fazerSom();

    }
}
