package br.com.brunadelmouro.oo.metodos;

public class ProgramaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.titular = "Bruna";
        minhaConta.saldo = 2000.0;

        minhaConta.saca(500);

        minhaConta.deposita(800);

        System.out.println("Saldo atual: "+ minhaConta.saldo);
    }
}
