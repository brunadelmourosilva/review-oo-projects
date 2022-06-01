package br.com.brunadelmouro.youtube.MCollections.test.sort.comparable;

import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListComparableProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("125", "camiseta polo G", 55.50);
        Produto p2 = new Produto("104", "camiseta polo M", 54.53);
        Produto p3 = new Produto("103", "camiseta baby look M", 40.50);
        Produto p4 = new Produto("117", "camiseta baby look PP", 25.80);

        //respondendo a pergunta feita na classe de testes SortListTest
        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        Collections.sort(produtos); //ordenando por preco: passa parametro para compareTo
        for (Produto produto: produtos) {
            System.out.println(produto);
        }

        System.out.println(p2.compareTo(p1)); //retorna negativo: preco é menor
        System.out.println(p1.compareTo(p2)); //retorna positivo: preco é maior


        //e se posteriormente algum desenvolvedor queira trocar a ordenação para id ou nome?
        //teremos que mexer no código inteiro?
        //e se surgir um erro para outros desenvolvedores  que estão com o mesmo código?
        //pergunta será respondida na próxima classe SortListComparatorProduto
    }
}
