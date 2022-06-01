package br.com.brunadelmouro.youtube.Hpolimorfismo.test;

import br.com.brunadelmouro.youtube.Hpolimorfismo.classes.Funcionario;
import br.com.brunadelmouro.youtube.Hpolimorfismo.classes.Gerente;
import br.com.brunadelmouro.youtube.Hpolimorfismo.classes.RelatorioPagamento;
import br.com.brunadelmouro.youtube.Hpolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Bruna", 5000, 2000);
        Vendedor v= new Vendedor("Cintia", 2000, 20000);
        RelatorioPagamento relatorio =  new RelatorioPagamento();

//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("---------------------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("---------------------------");
        relatorio.relatorioPagamentoGenerico(v);

        //casting widening
        Funcionario f = g;
        System.out.println("**---------------------------**");
        System.out.println(f.getSalario());
    }
}
