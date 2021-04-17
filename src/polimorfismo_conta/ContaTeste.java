package polimorfismo_conta;

public class ContaTeste {
    public static void main(String[] args) {

        ContaPF pf = new ContaPF("Vitória", 5600, "000000001", "000.000.000-88");
        ContaPJ pj = new ContaPJ("Bruna", 80500, "000000000222", "00.000.000/0000-00");

        Calcula_Rendimento.calculaRendimentoConta(pf);
        System.out.println(pf);

        Calcula_Rendimento.calculaRendimentoConta(pj);
        System.out.println(pj);
    }
}
