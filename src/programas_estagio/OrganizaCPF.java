package programas_estagio;

import java.util.Scanner;

public class OrganizaCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos CPFs deseja organizar? ");
        int qtd = sc.nextInt();

        sc.nextLine();

        String[] cpf = new String[qtd];

        System.out.println("Cole os CPFs aqui: ");
        for (int i = 0; i < qtd; i++) {
            cpf[i] = sc.nextLine();
            cpf[i] = cpf[i].replace(".", "");
            cpf[i] = cpf[i].replace("-", "");
        }

        for (int i = 0; i < cpf.length; i++) {
            for (int c = 0; c <= 2; c++) {
                System.out.print(cpf[i].charAt(c));
            }
            System.out.print(".");
            for (int c = 3; c <= 5; c++) {
                System.out.print(cpf[i].charAt(c));
            }
            System.out.print(".");
            for (int c = 6; c <= 8; c++) {
                System.out.print(cpf[i].charAt(c));
            }
            System.out.print("-");
            for (int c = 9; c < 11; c++) {
                System.out.print(cpf[i].charAt(c));
            }
            System.out.println();
        }

    }
}
