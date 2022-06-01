package br.com.brunadelmouro.youtube.Eenum.test;

import br.com.brunadelmouro.youtube.Eenum.classes.Cliente;
import br.com.brunadelmouro.youtube.Eenum.classes.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Brunna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.AVISTA);
        System.out.println(c); //imprime o método sobrescrito toString
    }
}
