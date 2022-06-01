package br.com.brunadelmouro.youtube.Hpolimorfismo.classes;

public class ArquivoDAO implements GenericDAO{
    @Override
    public void save() {
        System.out.println("salvando dados no arquivo");
    }
}
