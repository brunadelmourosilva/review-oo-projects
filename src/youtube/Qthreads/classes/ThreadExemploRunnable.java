package br.com.brunadelmouro.youtube.Qthreads.classes;

//boa prática
public class ThreadExemploRunnable implements Runnable {
    private char c;

    public ThreadExemploRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            //prioridade máxima a Thread | voltar ao estado Runnable
            Thread.yield();

            //parando a execução
//            try {
//                Thread.sleep(2000);
//                System.out.println();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
