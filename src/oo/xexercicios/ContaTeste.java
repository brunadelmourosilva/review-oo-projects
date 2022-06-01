package br.com.brunadelmouro.oo.xexercicios;

public class ContaTeste {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "Bruna";
        c1.agencia = "Bradesco";;
        c1.tipoConta = "Corrente";
        c1.numero = 000212551;
        c1.saldo = 2800.15;


        c1.deposito(1500);
        c1.saque(500);
        System.out.println("Rendimento mensal: "+ c1.calculaRendimento());

        /*--------------------------------*/
        System.out.println();
        System.out.println(c1.recuperaDadosParaImpressao());
        System.out.println();
        /*--------------------------------*/

        Conta c2 = new Conta();
        c2.titular = "Danilo";
        c2.saldo = 100;

        Conta c3 =	new	Conta();
        c3.titular = "Danilo";
        c3.saldo = 100;
        if	(c1	==	c2)	{
            System.out.println("iguais");
        }	else	{
            System.out.println("diferentes");
        }

    }
}
