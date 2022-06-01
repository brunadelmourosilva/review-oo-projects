package br.com.brunadelmouro.youtube.NGenerics.test;

import br.com.brunadelmouro.youtube.NGenerics.classes.Carro;
import br.com.brunadelmouro.youtube.NGenerics.classes.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerTest {
    public static void main(String[] args) {

        CarrosDisponiveis carroDisponivel = new CarrosDisponiveis();
        Carro carroAlugado = carroDisponivel.getCarrosDisponiveis();
        carroDisponivel.devolverCarro(carroAlugado);

    }
}

class FreeComputers{
    List<Computer> computerList  = new ArrayList<>();

    {
        System.out.println("Free Comouters: ");
        computerList.add(new Computer("Acer Aspire 5"));
        computerList.add(new Computer("Lenovo IDEPAD S145"));
    }

    public Computer getFreeComputers(){
        Computer c = computerList.remove(0);
        System.out.println("Alugando computador: " + c);
        System.out.println("Computadores disponiveis: "+ computerList);
        return c;
    }

    //Devolver
    public void putComputer(Computer c){
        System.out.println("Devolvendo computador "+ c);
        computerList.add(c);
        System.out.println("Computadores disponiveis: "+ computerList);
    }

}
