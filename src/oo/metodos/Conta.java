package br.com.brunadelmouro.oo.metodos;

class Conta	{

    //atributos de uma classe
    int	numero;
    String	titular;
    double	saldo;

    //métodos com passagem de parâmetros

    void saca(double quantidade){ //variável auxiliar
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    void deposita(double quantidade) {
        this.saldo	+=	quantidade;
    }
}

/*
* this: mostrar	 que esse é	um atributo, e não uma simples variável
* */
