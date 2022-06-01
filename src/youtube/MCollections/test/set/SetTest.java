package br.com.brunadelmouro.youtube.MCollections.test.set;

import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        Produto p1 = new Produto("125", "camiseta polo G", 55.50);
        Produto p2 = new Produto("104", "camiseta polo M", 54.53);
        Produto p3 = new Produto("103", "camiseta baby look M", 40.50);
        Produto p4 = new Produto("117", "camiseta baby look PP", 25.80);
        Produto p5 = new Produto("117", "camiseta baby look M", 25.80);

        Set<Produto> setProduto = new HashSet<>();
        //Set<Produto> setProduto = new LinkedHashSet<>(); //mantem a ordem de inserção
        setProduto.add(p1);
        setProduto.add(p2);
        setProduto.add(p3);
        setProduto.add(p4);
        setProduto.add(p5);
        //não permite elementos duplicados
        for (Produto p : setProduto) {
            System.out.println(p);
        }

    }
}
