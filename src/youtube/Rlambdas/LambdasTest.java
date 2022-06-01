package br.com.brunadelmouro.youtube.Rlambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasTest {
    public static void main(String[] args) {
        // é implementada com classes funcionais
        //classe anonima
        // exemplo com comparator


        List<String> nomes = new ArrayList<>();
        nomes.add("bruna");
        nomes.add("vitoria");
        nomes.add("marcir");
//
//        //criando uma classe anônima -> interface
//        Comparator<String> comprador = new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        };
//
//        Collections.sort(nomes, comprador);
//        System.out.println(nomes);

        Collections.sort(nomes, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        nomes.forEach(s -> System.out.println(s));

//        for (String s : nomes) {
//            System.out.println(s);
//        }
    }


}
