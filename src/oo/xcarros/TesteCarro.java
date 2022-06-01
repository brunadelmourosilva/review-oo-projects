package br.com.brunadelmouro.oo.xcarros;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.cor = "azul";
        carro.modelo = "gol";
        carro.velocidadeAtual = 60;
        carro.velocidadeMaxima = 120;

        carro.liga();

        carro.acelera(25);
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.pegaMarcha());
    }
}
