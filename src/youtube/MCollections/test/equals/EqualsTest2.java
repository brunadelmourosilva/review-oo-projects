package br.com.brunadelmouro.youtube.MCollections.test.equals;

import br.com.brunadelmouro.youtube.MCollections.classes.Celular;

public class EqualsTest2 {
    public static void main(String[] args) {
        Celular xiaomi0 = new Celular("redmi note 8", "1234");
        Celular xiaomi1 = new Celular("redmi note 8 lite", "1234");
        Celular xiaomi2 = new Celular("redmi note 8 plus", "1234");

        System.out.println(xiaomi0.equals(xiaomi2)); //regra da transitividade

        System.out.println(xiaomi0.hashCode());

    }
}
