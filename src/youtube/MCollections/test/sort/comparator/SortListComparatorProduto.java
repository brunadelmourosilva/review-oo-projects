package br.com.brunadelmouro.youtube.MCollections.test.sort.comparator;

import br.com.brunadelmouro.youtube.MCollections.classes.Produto;

import java.util.*;

//respondendo pergunta: como ordenar algo sem mexer na classe original? classe externa:
class ProdutoNomeComaparator implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class ProdutoIdComaprator implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class SortListComparatorProduto {
    public static void main(String[] args) {
        //respondendo a pergunta feita na classe de testes SortListTest
        List<Produto> produtos = new ArrayList<>();

        //criandos obejtos a partir de um array
        Produto[] produtosArray = new Produto[5];

        Produto p1 = new Produto("125", "camiseta polo G", 55.50);
        Produto p2 = new Produto("104", "camiseta polo M", 54.53);
        Produto p3 = new Produto("103", "camiseta baby look M", 40.50);
        Produto p4 = new Produto("117", "camiseta baby look PP", 25.80);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        System.out.println("ordenando por nome dos produtos:");
        //utilizando comparador personalizado
        Collections.sort(produtos, new ProdutoNomeComaparator()); //ordenando por nome: passando dois parametros para o compare()
        for (Produto produto: produtos) {
            System.out.println(produto);
        }
        System.out.println("-------------------------");

        System.out.println("ordenando por id dos produtos:");
        Collections.sort(produtos, new ProdutoIdComaprator());
        for (Produto produto: produtos) {
            System.out.println(produto);
        }
        System.out.println("-------------------------");





        //posso usar a classe Arrays para ordenar também
        produtosArray[0] = p1;
        produtosArray[1] = p2;
        produtosArray[2] = p3;
        produtosArray[3] = p4;

        System.out.println("utlizando a calsse Arrays:");
        System.out.println(Arrays.toString(produtosArray)); // sem usar foreach
        System.out.println("-------------------------");

//        Arrays.sort(produtosArray, new ProdutoNomeComaparator());
//        for (Produto produto: produtos) {
//            System.out.println(produto);
//        }
//        System.out.println("-------------------------");


    }
}
