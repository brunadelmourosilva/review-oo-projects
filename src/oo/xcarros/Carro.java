package br.com.brunadelmouro.oo.xcarros;

public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor; //referência

    void liga(){
        System.out.println("Ligando o carro...");
    }

    void acelera(double quantidade){
        double novaVelocidade = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = novaVelocidade;
    }

    int pegaMarcha(){
       if(this.velocidadeAtual < 0) return -1;
       if (this.velocidadeAtual >=0 && this.velocidadeAtual < 40) return 1;
       if (this.velocidadeAtual >=40 && this.velocidadeAtual < 90) return 2;

       return 0;
    }
}
