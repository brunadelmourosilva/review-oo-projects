package br.com.brunadelmouro.youtube.Fabstract.classes;


//uma classe abstrata nunca pode ser instanciada
public abstract class Funcionario {
    protected String nome;
    protected String clt;
    protected double salario;

    public Funcionario(){}

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    //se um método é abstrato, a classe precisa ser abstrata também
    //um método abstrato não possui corpo
    //um método abstrato precisa ser implementado por todas as classes
    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
