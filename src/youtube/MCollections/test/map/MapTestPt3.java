package br.com.brunadelmouro.youtube.MCollections.test.map;

import br.com.brunadelmouro.youtube.MCollections.classes.Consumidor;
import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTestPt3 {

    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("bruna", "123");
        Consumidor consumidor2 = new Consumidor("alex", "456");

        Produto p1 = new Produto("125", "camiseta polo G", 55.50);
        Produto p2 = new Produto("104", "camiseta polo M", 54.53);
        Produto p3 = new Produto("103", "camiseta baby look M", 40.50);
        Produto p4 = new Produto("117", "camiseta baby look PP", 25.80);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(p1);
        produtosCon1.add(p2);

        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(p3);
        produtosCon2.add(p4);

        map.put(consumidor1, produtosCon1);
        map.put(consumidor2, produtosCon2);
        for (Map.Entry<Consumidor, List<Produto>> c : map.entrySet()) {
            System.out.println(c.getKey().getNome());

            for (Produto produto : c.getValue()) {
                System.out.println(produto.getNome());
            }
            System.out.println("----------");
        }
    }
}
