package br.com.brunadelmouro.youtube.Ginterface.calsses.test;

import br.com.brunadelmouro.youtube.Ginterface.calsses.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook Acer", 2.5, 3000);

        p.calcularFrete();
        p.calcularImposto();
        System.out.println(p);
    }
}
