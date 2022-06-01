package br.com.brunadelmouro.youtube.Ginterface.calsses;

//nome: I no começo ou adverbio

//é um contrato, diz o que pode fazer mas nunca como fazer

public interface Tributavel {

    //todos os atributos são estaticos(public static final)
     double IMPOSTO = 0.2;

    //todos os metodos são abstratos e publicos(public abstract)
    void calcularImposto();
}
