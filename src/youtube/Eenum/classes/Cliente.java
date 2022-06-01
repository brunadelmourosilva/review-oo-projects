package br.com.brunadelmouro.youtube.Eenum.classes;

public class Cliente {

    //enum dentro da classe
    public enum TipoPagamento{
        AVISTA, APRAZO;
    }

    private String nome;
    private TipoCliente tipoCliente; //classe TipoCliente
    private TipoPagamento tipoPagamento; //classe principal cliente

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", numero=" + tipoCliente.getTipo() +
                '}';
    }

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
