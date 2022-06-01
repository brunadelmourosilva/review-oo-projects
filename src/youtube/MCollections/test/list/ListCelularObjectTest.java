package br.com.brunadelmouro.youtube.MCollections.test.list;

import br.com.brunadelmouro.youtube.MCollections.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularObjectTest {
    public static void main(String[] args) {
        Celular cel1 = new Celular("redmi", "232323");
        Celular cel2 = new Celular("iphone", "12121");
        Celular cel3 = new Celular("samsung", "111");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(cel1);
        celularList.add(cel2);
        celularList.add(cel3);

        for (Celular cel : celularList) {
            System.out.println(cel);
        }

        //-----------
        Celular cel4 =new Celular("redmi", "232323");
        System.out.println(cel1.equals(cel4));
        //-----------
        System.out.println(cel1.hashCode());
        System.out.println(cel4.hashCode());
    }
}
