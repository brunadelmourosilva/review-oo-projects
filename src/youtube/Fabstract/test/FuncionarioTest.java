package br.com.brunadelmouro.youtube.Fabstract.test;

import br.com.brunadelmouro.youtube.Fabstract.classes.Funcionario;
import br.com.brunadelmouro.youtube.Fabstract.classes.Gerente;
import br.com.brunadelmouro.youtube.Fabstract.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Bruna", "11111-2", 5000.9);
        Vendedor v = new Vendedor("Axl", "10001-2", 2200.6, 6);

        System.out.println(g);
        g.calculaSalario();

        System.out.println(v);
        v.calculaSalario();
    }
}
