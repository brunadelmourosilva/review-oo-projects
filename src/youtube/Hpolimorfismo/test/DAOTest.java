package br.com.brunadelmouro.youtube.Hpolimorfismo.test;

import br.com.brunadelmouro.youtube.Hpolimorfismo.classes.ArquivoDAO;
import br.com.brunadelmouro.youtube.Hpolimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arq = new ArquivoDAO();
        arq.save();

        List<String> lista = new ArrayList<>();
        lista.add("nome1");
        lista.add("nome2");
        lista.add("nome3");
        lista.add("nome4");

        for (String nome : lista) {
            System.out.println(nome);
        }

    }
}
