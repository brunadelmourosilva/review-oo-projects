package br.com.brunadelmouro.youtube.Fabstract.classes;

public class Gerente extends Funcionario{

    //sobrecarga
    public Gerente(){}

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.2);
    }

}
