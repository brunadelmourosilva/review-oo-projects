package br.com.brunadelmouro.youtube.NGenerics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable{
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }

    @Override
    public int compareTo(Object outroObjeto) {
        return 0;
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildCardGenericTest{
    //type erasure
    //generics funcionam em tempo de compilação, mas não em execução
    public static void main(String[] args) {
//        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
//        Gato[] gatos = {new Gato(), new Gato()};
//
//        WildCardGenericTest.consultarAnimais(cachorros);
//        WildCardGenericTest.consultarAnimais(gatos);

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());

        //erro de compilação
        //consultarAnimaisList(gatoList);
        WildCardGenericTest.consultarAnimaisList(gatoList);
        WildCardGenericTest.consultarAnimaisList(cachorroList);

        WildCardGenericTest.ordenarLista(cachorroList);
    }

    public static void consultarAnimais(Animal[] animais){
        for (Animal a : animais) {
            a.consulta();
        }
    }

    // type erasure -> ?(posso passar qualquer tipo que seja filha de animal)
    public static void consultarAnimaisList(List<? extends Animal> animals){
        for (Animal a : animals) {
            a.consulta();
        }
    }

    //garantia de adicionar somente um tipo na lista
    //lista do tipo Cachorro ou super classes de Cachorro(Animal ou Object)
    public static void consultarCahorrosList(List<? super Cachorro> cachorrosList){
        Cachorro c1 = new Cachorro();
        Animal a1 = new Cachorro();
        Object o = new Cachorro();
        cachorrosList.add(new Cachorro());
    }

    public static void ordenarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
