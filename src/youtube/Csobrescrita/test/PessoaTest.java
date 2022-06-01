package br.com.brunadelmouro.youtube.Csobrescrita.test;

import br.com.brunadelmouro.youtube.Csobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNome("Bruna");
        p.setIdade(400);
        p.setAltura(1.62);
        System.out.println(p);

        Pessoa p2 = new Pessoa();

        p2.setNome("Vitoria");
        p2.setIdade(500);
        p2.setAltura(1.65);
        System.out.println(p2);

    }
}
