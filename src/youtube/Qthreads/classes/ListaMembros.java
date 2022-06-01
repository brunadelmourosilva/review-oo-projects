package br.com.brunadelmouro.youtube.Qthreads.classes;


import java.util.LinkedList;
import java.util.Queue;

//sistema que faz envio e recebimento de emails utilizando threads
// os tres metodos fazem parte da classe Object
public class ListaMembros {

    private final Queue<String> emails = new LinkedList<>();
    private boolean aberta = true;

    //retorna quantos e-mails estão pendentes
    public int getEmailsPendentes() {
        synchronized (emails) {
            return this.emails.size();
        }
    }

    // e-mail em aberto para envio
    public boolean isAberta() {
        return aberta;
    }

    //obtém e-mail
    public String obterEmailMembro() {
        String email = null;

        try {
            synchronized (this.emails) {
                while (this.emails.size() == 0) {
                    if (!aberta) return null;
                    System.out.println("Lista vazia, inserindo a thread: " + Thread.currentThread().getName() + " em modo WAIT");
                    this.emails.wait(); //thread bloqueada enquanto não há e-mail
                }
                email = this.emails.poll();
            }
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        return email;
        }

        //adicionar e-mail
        public void adicionarEmailMembro(String emailPassado){
            synchronized (this.emails){
                this.emails.add(emailPassado);
                System.out.println("E-mail adicionado na lista");
                System.out.println("NOTIFICANDO TODAS as threads que estão em espera");
                this.emails.notifyAll();
            }
        }

        //fechar lista
        public void fecharLista(){
            System.out.println("NOTIFICANDO TODAS as threads e fechando a lista");
            aberta = false;
            synchronized (this.emails){
                this.emails.notifyAll();
            }
        }
    }
