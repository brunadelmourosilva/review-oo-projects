package polimorfismo_conta;

public class Calcula_Rendimento {

    public static void calculaRendimentoConta(Conta c){

        if(c instanceof ContaPF){
            ContaPF ref = (ContaPF) c;
            c.setRendimento(c.getSaldo() * 0.10);
            Conta.setTipo(Tipo.TIPO_PF);

        } else if( c instanceof ContaPJ){
            ContaPJ ref = (ContaPJ) c;
            c.setRendimento(c.getSaldo() * 0.50);
            Conta.setTipo(Tipo.TIPO_PJ);

        }
    }
    
}
