package br.com.brunadelmouro.youtube.Csobrescrita.classes;

public class Pessoa extends Object{
    private String nome;
    private int idade;
    private double altura;

    //sobrescrita consiste em mudar o comportamento de um método da superclasse para um comportamento definido
    // por você(ex: mudar o comportamento de 'toString' para imprimir o nome e idade)
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
