package br.com.brunadelmouro.youtube.MCollections.test.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//comparable
//comparator em produto
//fazer exemplo p5 p6 p7
public class SortListTest {
    public static void main(String[] args) {

        //ordenação de Strings: Collections.sort(ordena por ordem alfabética)
        List<String> nomes = new ArrayList<>();
        nomes.add("Bruna");
        nomes.add("Adilson");
        nomes.add("Alex");
        nomes.add("Marcir");

        Collections.sort(nomes);
        for (String nome: nomes) {System.out.println(nome);}

        System.out.println("---------------------------");

        //ordenação de números: Collections.sort(ordena por ordem cresecnte)
        List<Double> numeros = new ArrayList<>();
        numeros.add(10.6);
        numeros.add(5d);
        numeros.add(-5.3);
        numeros.add(100d);
        Collections.sort(numeros);
        for (Double numero: numeros) {System.out.println(numero);}

        //como o Java sabe qual o tipo da lista para ordenação? E se uma lista do tipo Objeto?
        //vejamos um exemplo na classe criada chamada Produto
    }
}
