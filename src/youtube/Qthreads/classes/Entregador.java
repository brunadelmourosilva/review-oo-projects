package br.com.brunadelmouro.youtube.Qthreads.classes;

//thread de execução
public class Entregador implements Runnable{
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + "começando o trabalho de entrega");

        int qtdPendentes = listaMembros.getEmailsPendentes();
        boolean aberta = listaMembros.isAberta();

        while(aberta || qtdPendentes > 0){
            try {
                String email = listaMembros.obterEmailMembro();
                if(email != null){
                    System.out.println(nomeThread + "enviando email para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + " concluido com sucesso");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            aberta = listaMembros.isAberta();
            qtdPendentes = listaMembros.getEmailsPendentes();
        }
        System.out.println("Atividades finalizadas");
    }
}
