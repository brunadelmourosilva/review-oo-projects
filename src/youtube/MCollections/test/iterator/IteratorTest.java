package br.com.brunadelmouro.youtube.MCollections.test.iterator;

import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("125", "camiseta polo G", 55.50, 5);
        Produto p2 = new Produto("104", "camiseta polo M", 54.53, 10);
        Produto p3 = new Produto("103", "camiseta baby look M", 40.50, 0);
        Produto p4 = new Produto("117", "camiseta baby look PP", 25.80, 0);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        Iterator<Produto> produtoIterator = produtos.iterator();
        while(produtoIterator.hasNext()){
                if(produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
        for (Produto p: produtos) {
            System.out.println(p);
        }

        //não utilizar remove() no for
//        for (Produto p : produtos){
//            if(p.getQuantidade() == 0){
//                produtos.remove(p);
//            }
//        }
    }
}
