package br.com.brunadelmouro.youtube.MCollections.test.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("bruna");
        names.add("bruna");
        names.add("vitória");
        names.remove("bruna"); //remove

        names2.add("Teste2");
        names2.add("Teste2.1");
        names.addAll(names2); //adiciona a lista names2 na lista names

        System.out.println("size: "+ names.size());
        System.out.println("equals: "+ names.remove("vitória"));
        System.out.println("size: "+ names.size());


        //names.clear(); //somente limpa os dados e não a lista
        System.out.println("------------------------");
        int size = names.size(); //definindo um tamanho fixo
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
//            names.add("alex");
        }
//        System.out.println(names.get(2));
//        System.out.println("------------------------");

    }
}
