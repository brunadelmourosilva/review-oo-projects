package br.com.brunadelmouro.youtube.Qthreads.tests;

import br.com.brunadelmouro.youtube.Qthreads.classes.ThreadExemploRunnable;

//daemon(JVM  pode parar a qualquer momento) x user(JVM não para de ser executada)
public class ThreadsTest {

    public static void main(String[] args) throws InterruptedException {
//        ThreadExemplo t1 = new ThreadExemplo('A');
//        ThreadExemplo t2 = new ThreadExemplo('B');
//        ThreadExemplo t3 = new ThreadExemplo('C');
//        ThreadExemplo t4 = new ThreadExemplo('D');

        //todas na thread main
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();

        //separando as threads
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

        //polimorfismo
        Thread r1 = new Thread(new ThreadExemploRunnable('A'), "T1");
        Thread r2 = new Thread(new ThreadExemploRunnable('B'), "T2");
        r1.setPriority(Thread.MAX_PRIORITY); //yield

        r1.start();
        r1.join(); //main executa t1, e depois de finalizar, dá prosseguimento a outras
        r2.start();
    }
}
