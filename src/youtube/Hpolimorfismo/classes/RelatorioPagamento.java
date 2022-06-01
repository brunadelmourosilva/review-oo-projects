package br.com.brunadelmouro.youtube.Hpolimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("Relatorio gerente");
        gerente.calculaPagamento();
        System.out.println(gerente.getNome());
        System.out.println(gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("Relatorio gerente");
        vendedor.calculaPagamento();
        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getSalario());
    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Relatorio de pagamento");
        funcionario.calculaPagamento();
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
