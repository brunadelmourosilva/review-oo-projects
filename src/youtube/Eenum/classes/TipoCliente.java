package br.com.brunadelmouro.youtube.Eenum.classes;

public enum TipoCliente {
    //a enumeração passa a receber valores, que no caso serão um inteiro e uma String e que
    // por conseguinte, passarão para o construtor
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    //constant specific class body

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}

