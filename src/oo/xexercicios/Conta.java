package br.com.brunadelmouro.oo.xexercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

class Conta {

    //criar um método de datas
    Date dataAbertura = new Date();
    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:MM:SS:MMM");

    String titular;
    String agencia;
    String tipoConta;
    int numero;
    double saldo;

    String dtFormatada = DateFormat.getTimeInstance().format(dataAbertura);

    void saque(double valor){
        if(this.saldo < valor){
            System.out.println("Saldo menor que o valor desejado, tente novamente.");
        }
        else{
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Saldo atual: " + this.saldo);
        }

    }

    void deposito(double valor){
        this.saldo += valor;
        System.out.println("Saldo atual: " + this.saldo);
    }

    double calculaRendimento(){
        return this.saldo = this.saldo * 1.10;
    }
    /*--------------------------------------------------*/

    String	recuperaDadosParaImpressao() {
        String dados = "Titular:" + this.titular;
        dados	+=	"\nAgência: " + this.agencia;
        dados	+=	"\nNúmero: " + this.numero;
        dados	+=	"\nSaldo: " + this.saldo;
        dados	+=	"\nData de abertura: " + this.dataAbertura;
        dados	+=	"\nRendimento: " + this.calculaRendimento();
        return dados;
    }

    /*--------------------------------------------------*/


}
