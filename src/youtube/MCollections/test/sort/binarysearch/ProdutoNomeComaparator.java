package br.com.brunadelmouro.youtube.MCollections.test.sort.binarysearch;

import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.Comparator;

//respondendo pergunta: como ordenar algo sem mexer na classe original? classe externa:
class ProdutoNomeComaparator implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

