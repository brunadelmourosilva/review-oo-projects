package br.com.brunadelmouro.youtube.Fabstract.classes;

public class Vendedor extends Funcionario{

    private double vendasVendedor;

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double vendas) {
        super(nome, clt, salario);
        this.vendasVendedor = vendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (vendasVendedor * 0.5);
    }

    public double getVendas() {
        return vendasVendedor;
    }

    public void setVendas(double vendas) {
        this.vendasVendedor = vendas;
    }
}
