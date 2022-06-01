package br.com.brunadelmouro.youtube.Qthreads.classes;

public class ThreadExemplo extends Thread {
    private char c;

    public ThreadExemplo(char c) {
        this.c = c;
    }

    //sobrescrever o método run da classe Thread
    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}
