package br.com.brunadelmouro.youtube.Bherenca;

public class Funcionario extends Pessoa{
    private double salario;

    {
        System.out.println("Bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Bloco de inicialização de funcionário 2");
    }

    static {
        System.out.println("Bloco de inicialização estático de funcionário");
    }

    //Herança e construtores
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    /*--------------------------------*/

    public void imprime(){
        super.imprime(); // método imprime() proveniente da classe mãe
        System.out.println("Salário: " + this.salario);

        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu, "+ super.nome + ", Recebi o valor total de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
