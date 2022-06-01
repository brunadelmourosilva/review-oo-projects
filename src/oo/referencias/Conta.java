package br.com.brunadelmouro.oo.referencias;

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

    boolean transferePara(Conta destino, double valor){
        boolean retirou = this.saca(valor); //utlizando um método dentro de outro

        if (!retirou) {
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }



}

/*
* this: mostrar	 que esse é	um atributo, e não uma simples variável
* */
