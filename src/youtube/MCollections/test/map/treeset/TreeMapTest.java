package br.com.brunadelmouro.youtube.MCollections.test.map.treeset;

import br.com.brunadelmouro.youtube.MCollections.classes.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        NavigableMap<String, Consumidor> mapNavigable = new TreeMap<>();
        Consumidor consumidor1 = new Consumidor("bruna", "123");
        Consumidor consumidor2 = new Consumidor("alex", "456");
        
        mapNavigable.put("D", consumidor1);
        mapNavigable.put("A", consumidor2);
        mapNavigable.put("B", consumidor1);

        for (Map.Entry<String, Consumidor> entry : mapNavigable.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        //metodos
        System.out.println(mapNavigable.headMap("B"));
        System.out.println(mapNavigable.higherEntry("A"));
        System.out.println(mapNavigable.descendingMap());
    }
}
