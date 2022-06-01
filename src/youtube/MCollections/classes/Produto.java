package br.com.brunadelmouro.youtube.MCollections.classes;

import java.util.Objects;
import java.util.Scanner;

//classe contendo atributo estatico, equals, hashCode, toString, metodos getters e setters, bloco estatico
//implementando interface Comparable para a classe(assim como nos Wrappers String, Double e etc)
public class Produto implements Comparable<Produto>{
    private String id;
    private String nome;
    private Double preco;
    private int quantidade;
    private static String nomeLoja;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da loja: ");
        Produto.setNomeLoja(sc.nextLine());
    }

    public Produto(String id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String id, String nome, Double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //ordenará por preço
    @Override
    public int compareTo(Produto outroObjeto) {
        //retorna: negativo se thisObject < outroObjeto
        //retorna: neutro(0) se thisObject == outroObjeto
        //retorna: positivo se thisObject > outroObjeto
        return this.preco.compareTo(outroObjeto.getPreco());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o; //produto = variável ref em polimorfismo
        return Objects.equals(this.id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static String getNomeLoja() {
        return nomeLoja;
    }

    public static void setNomeLoja(String nomeLoja) {
        Produto.nomeLoja = nomeLoja;
    }
}
