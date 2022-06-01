package br.com.brunadelmouro.oo.referencias;

public class ProgramaConta {
    public static void main(String[] args) {

        // conta1 e conta2 são referências ao objeto do tipo Conta
        Conta conta1 = new Conta();
        conta1.titular = "Bruna";
        conta1.saldo = 2000;

        Conta conta2 = new Conta();
        conta2.titular = "Vitoria";
        conta2.saldo = 3000;

        //Conta1 transfere para conta2 50 reais
        System.out.println(conta1.transferePara(conta2, 2500));


    }
}
