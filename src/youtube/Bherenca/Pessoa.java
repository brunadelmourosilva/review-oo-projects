package br.com.brunadelmouro.youtube.Bherenca;

public class Pessoa {
    protected String nome; //protected - informa o acesso fora do pacote para classes filhas ou classes do mesmo pacote
    protected String cpf;
    protected Endereco endereco;

    {
        System.out.println("Bloco de inicialização de pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização de pessoa 2");
    }

    static {
        System.out.println("Bloco de inicialização estático de pessoa(só executa uma única vez)");
    }

    //Herança e construtores
    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome); //passa como referencia o nome
        this.cpf = cpf;
    }

    /*--------------------------------*/
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    //associação
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
