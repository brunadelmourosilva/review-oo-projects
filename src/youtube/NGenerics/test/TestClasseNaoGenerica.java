package br.com.brunadelmouro.youtube.NGenerics.test;

import br.com.brunadelmouro.youtube.NGenerics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class TestClasseNaoGenerica {
    public static void main(String[] args) {

        CarrosDisponiveis carroDisponivel = new CarrosDisponiveis();
        Carro carroAlugado = carroDisponivel.getCarrosDisponiveis();
        carroDisponivel.devolverCarro(carroAlugado);

    }
}

class CarrosDisponiveis{
    List<Carro> carrosList  = new ArrayList<>();

    {
        System.out.println("Carros Disponiveis: ");
        carrosList.add(new Carro("CrossFox 2012"));
        carrosList.add(new Carro("Ferrari"));
    }
    //Alugar
    public Carro getCarrosDisponiveis(){
        Carro c = carrosList.remove(0);
        System.out.println("Alugando carro: "+ c);
        System.out.println("Carros disponiveis: "+ carrosList);
        return c;
    }

    //Devolver
    public void devolverCarro(Carro c){
        System.out.println("Devolvendo carro "+ c);
        carrosList.add(c);
        System.out.println("Carros disponiveis: "+ carrosList);
    }

}
