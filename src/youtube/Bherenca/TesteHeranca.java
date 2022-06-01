package br.com.brunadelmouro.youtube.Bherenca;

public class TesteHeranca {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Bruna");
        Endereco e = new Endereco();

        p.setCpf("0000000");
        e.setBairro("jardim floresta");
        e.setRua("rua das palmeiras");
        p.setEndereco(e);
        p.imprime();

        System.out.println("---------------------");

        Funcionario f = new Funcionario("Alex");
        f.setCpf("9999999");
        f.setSalario(2500);
        f.setEndereco(e);
        f.imprime();
    }
}
