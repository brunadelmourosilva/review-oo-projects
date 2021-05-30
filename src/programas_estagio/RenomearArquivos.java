package programas_estagio;

import java.util.Arrays;
import java.util.Scanner;

class Code{
     static String[] generateCode(int numberNames, String[] array){
        String[] arrayCode = new String[numberNames];

         for (int i = 0; i < array.length; i++) {
             arrayCode[i] = "ren " + "\"n_" + (i) +".pdf\""
                     + " " + "\"" + array[i] + ".pdf\"";
         }

        return arrayCode;
    }
}

public class RenomearArquivos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("--------------------------------------\n");
            System.out.print("Digite a quantidade de nomes: ");
            int numberNames = Integer.parseInt(input.nextLine());

            String[] array = new String[numberNames];

            System.out.printf("Insira os %d nomes: \n", numberNames);
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextLine().trim();
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println(Code.generateCode(numberNames, array)[i]);
            }
            System.out.println();
        }
    }
}
