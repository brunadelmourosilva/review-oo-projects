package br.com.brunadelmouro.oo.metodosretorno;

public class ProgramaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.titular = "Bruna";
        minhaConta.saldo = 2000.0;

        if (minhaConta.saca(3000))
            System.out.println("Saque realizado com sucesso");
        else
            System.out.println("Valor acima do saldo atual :(");
    }
}
