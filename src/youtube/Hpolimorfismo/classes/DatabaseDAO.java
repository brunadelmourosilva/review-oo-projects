package br.com.brunadelmouro.youtube.Hpolimorfismo.classes;

public class DatabaseDAO implements GenericDAO{

    @Override
    public void save() {
        System.out.println("salvando dados no banco de dados");
    }
}
