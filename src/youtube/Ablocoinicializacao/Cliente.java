package br.com.brunadelmouro.youtube.Ablocoinicializacao;

public class Cliente {
    private int parcela[] = new int[100];
    private String nome,rg;

    public void printa(){
        System.out.println(this.nome);
        System.out.println(this.rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public void printaParcelas(){
        for(int i=0; i<this.parcela.length; i++){
            System.out.print(this.parcela[i] + " ");
        }
    }

    {
        //bloco inicializador, sempre roda antes do construtor
        for (int i=0; i<this.parcela.length; i++){
            this.parcela[i] = i+1;
        }
    }

    public Cliente(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
    }

}