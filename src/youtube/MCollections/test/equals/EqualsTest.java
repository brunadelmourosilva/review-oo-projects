package br.com.brunadelmouro.youtube.MCollections.test.equals;

public class EqualsTest {
    public static void main(String[] args) {

        //comparar a significado de determinado objeto e não seu endereço de memória
        //exemplo
        String n1 = "Bruna";
        String n2 = "Bruna";
        System.out.println(n1 == n2); //retorna true

        String s = new String("Delmouro");
        String s2 = "Delmouro";
        System.out.println(s == s2); // retorna false pois estão em enderecos diferentes
        System.out.println(s.equals(s2)); //retorna true pois compara o significado do objeto

    }
}
