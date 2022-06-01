package br.com.brunadelmouro.oo.referenciasclasses;

public class ProgramaConta {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Cliente c = new Cliente();

        //atribuição
        conta.titular = c;

        conta.titular.nome = "Bruna";

    }
}
