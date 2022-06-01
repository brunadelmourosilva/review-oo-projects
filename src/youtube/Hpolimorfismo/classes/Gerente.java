package br.com.brunadelmouro.youtube.Hpolimorfismo.classes;

public class Gerente extends Funcionario {
    private double participacaoLucro;

    public Gerente(String nome, double salario, double participacaoLucro) {
        super(nome, salario);
        this.participacaoLucro = participacaoLucro;
    }

    @Override
    public void calculaPagamento() {
        this.salario = this.salario * this.participacaoLucro;
    }

    public double getParticipacaoLucro() {
        return participacaoLucro;
    }

    public void setParticipacaoLucro(double participacaoLucro) {
        this.participacaoLucro = participacaoLucro;
    }
}
