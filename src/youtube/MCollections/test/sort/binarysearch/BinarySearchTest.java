package br.com.brunadelmouro.youtube.MCollections.test.sort.binarysearch;


import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(0);
        numeros.add(6);

        //antes, é preciso ordenar a lista para ter resultados de busca previsiveis
        Collections.sort(numeros);

        // (- (ponto de inserção) - 1)
        //se usar comparator: passar no binarySearch

        //busca
        //indices: 0, 1, 2, 3
        //valores: 0, 1, 3 ,6(valores ordenados)
        System.out.println(Collections.binarySearch(numeros, 3)); //retorna o indice
        System.out.println(numeros.get(Collections.binarySearch(numeros, 3))); //retorna o objeto

        //____________________________
        //usando objetos
        List<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("125", "camiseta polo G", 55.50);
        Produto p2 = new Produto("104", "camiseta polo M", 54.53);
        Produto p3 = new Produto("103", "camiseta baby look M", 40.50);
        Produto p4 = new Produto("117", "camiseta baby look PP", 25.80);
        produtos.add(p1);
        produtos.add(p2);
        //produtos.add(p3);
        //produtos.add(p4);

        Collections.sort(produtos, new ProdutoNomeComaparator());
        for(Produto p : produtos){
            System.out.println(produtos);
        }

        System.out.println(Collections.binarySearch(produtos, p1, new ProdutoNomeComaparator()));
    }
}
