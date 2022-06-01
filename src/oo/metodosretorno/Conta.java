package br.com.brunadelmouro.oo.metodosretorno;

class Conta	{

    int	numero;
    String	titular;
    double	saldo;

    boolean	saca(double	valor) {
        if	(this.saldo	< valor){
            return false;
        }
        else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }


    void deposita(double quantidade) {
        this.saldo	+=	quantidade;
    }
}

/*
* this: mostrar	 que esse é	um atributo, e não uma simples variável
* */
