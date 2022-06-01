package br.com.brunadelmouro.youtube.Qthreads.classes;

public class Conta {
    private int saldo = 50;

    public int getSaldo() {
        return saldo;
    }

    public void saqueThread(int valor){
        this.saldo = this.saldo - valor;
    }
}
