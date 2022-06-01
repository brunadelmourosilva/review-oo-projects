package br.com.brunadelmouro.youtube.Qthreads.tests;


import br.com.brunadelmouro.youtube.Qthreads.classes.Entregador;
import br.com.brunadelmouro.youtube.Qthreads.classes.ListaMembros;

import javax.swing.*;
import java.util.function.Consumer;

//passando os e-mails para a classe
public class EntregadorTest {
    public static void main(String[] args) {

        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");



        t1.start();
        t2.start();

        while (true){
            String email = JOptionPane.showInputDialog("Digite o e-mail do membro");
            if(email == null || email.isEmpty()){
                listaMembros.fecharLista();
                break;
            }
            listaMembros.adicionarEmailMembro(email);
        }
    }
}
