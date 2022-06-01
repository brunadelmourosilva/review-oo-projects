package br.com.brunadelmouro.youtube.Dmodificadorfinal.test;

import br.com.brunadelmouro.youtube.Dmodificadorfinal.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c = new Carro();
        System.out.println(c.getComprador());

        c.getComprador().setNome("Bruna");
        System.out.println(c.getComprador());
    }
}
