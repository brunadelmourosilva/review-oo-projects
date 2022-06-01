package br.com.brunadelmouro.youtube.Qthreads.tests;

import br.com.brunadelmouro.youtube.Qthreads.classes.Conta;

public class ContaTest implements Runnable{
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest(); //contém a classe Conta e Runnable
        Thread bruna = new Thread(contaTest, "Bruna");
        Thread alex = new Thread(contaTest, "Alex");
        bruna.start();
        alex.start();
    }

    public static void imprimeClasse(){
        synchronized (ContaTest.class){
            System.out.println("aaaaaa");
        }
    }

    //atomicidade - método sícnrono
    //cada objeto da instancia privada tem um "lock" em um método/bloco
    public void saque(int valor){
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + "está indo sacar");
                conta.saqueThread(valor);
                System.out.println(Thread.currentThread().getName() + "completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + "para efetuar saque, saldo: " + conta.getSaldo());
            }
        }
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { //saque de 5 em 5
            saque(10);
            if(conta.getSaldo() < 0){
                System.out.println("Oh meu Deus");
            }
        }
    }


}
