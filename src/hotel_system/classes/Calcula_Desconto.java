package hotel_system.classes;

import java.util.Scanner;

public class Calcula_Desconto{

    public static void calculaDesconto(Cliente c){
        if(c instanceof ClienteComum){
            ClienteComum ref = (ClienteComum) c;
            System.out.print("Data do check-out: ");
            c.setDtCheckout(new Scanner(System.in).nextLine());
            System.out.println("OK!");

        } else if(c instanceof ClienteVIP){
            ClienteVIP ref = (ClienteVIP) c;
            System.out.print("Data do check-out: ");
            c.setDtCheckout(new Scanner(System.in).nextLine());

            ref.setDescontoVip(c.getGastoTotal() - (c.getGastoTotal() * 0.15));

            System.out.println("OK!");
        }
    }
}
