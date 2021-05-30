package hotel_system.test;

import hotel_system.classes.Calcula_Desconto;
import hotel_system.classes.Cliente;
import hotel_system.classes.ClienteComum;
import hotel_system.classes.ClienteVIP;

import java.util.*;

public class TestCliente {
    public static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Nome do hotel: ");
        Cliente.setNome_hotel(SC.nextLine());
        System.out.println("\t Bem-vindo ao hotel " + Cliente.getNome_hotel() + "\n");

        List<ClienteComum> comumList = new ArrayList<>();
        List<ClienteVIP> vipList = new ArrayList<>();
        List<Cliente> clientesInativos = new ArrayList<>();

        int op;
        do{
            op = exibeOpcoes();
            switch (op){
                case 1: cadastraCliente(comumList, vipList);
                    break;
                case 2: realizaCheckout(comumList, vipList, clientesInativos);
                    break;
                case 3: listaClientes(comumList, vipList);
                    break;
                case 4: listaClientesInativos(clientesInativos);
                    break;
                case 5: listaGastos(comumList, vipList);
                    break;
                case 6: realizaVendas(comumList, vipList);
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção incorreta.");
            }
        }while(op != 0);

    }
    public static void cadastraCliente(List<ClienteComum> comumList, List<ClienteVIP> vipList){
        SC.nextLine();
        System.out.print("Nome: "); String nome = SC.nextLine();
        System.out.print("CPF: "); String cpf = SC.nextLine();
        System.out.print("Data: "); String dtChek = SC.nextLine();
        System.out.print("Cliente comum[1] ou VIP[2]: "); int tipo = SC.nextInt();
        if(tipo == 1){
            comumList.add(new ClienteComum(nome, cpf, dtChek));
            Collections.sort(comumList);
        }
        else if(tipo == 2){
            vipList.add(new ClienteVIP(nome, cpf, dtChek));
            Collections.sort(vipList);
        }
        System.out.println("Adicionado com sucesso!");
    }

    public static void realizaCheckout(List<ClienteComum> comumList,List<ClienteVIP> vipList, List<Cliente> clientesInativos){

        System.out.print("Cliente comum[1] ou VIP[2]: ");
        int tipo = SC.nextInt();

        System.out.print("Digite o indice do cliente: "); int indice = SC.nextInt();
        if(tipo == 1){
            int size = comumList.size();

            for (int i = 0; i < size; i++) {
                if(indice == i){
                    Calcula_Desconto.calculaDesconto(comumList.get(indice));
                    System.out.println(comumList.get(indice));

                    clientesInativos.add(comumList.get(indice));
                    comumList.remove(indice);
                }
            }
        } else if(tipo == 2){
            int size = vipList.size();
            for (int i = 0; i < size; i++) {
                if(indice == i){
                    Calcula_Desconto.calculaDesconto(vipList.get(indice));
                    System.out.println(vipList.get(indice));

                    clientesInativos.add(vipList.get(indice));
                    vipList.remove(indice);
                }
            }
        }
    }

    public static void listaClientes(List<ClienteComum> comumList,List<ClienteVIP> vipList){
        System.out.println("\nClientes Comuns");
        for (ClienteComum cm : comumList) {
            System.out.println(cm);
        }
        System.out.println("-----------");

        System.out.println("Clientes VIPs");
        for (ClienteVIP cv : vipList) {
            System.out.println(cv);
        }
    }

    public static void listaClientesInativos(List<Cliente> clientesInativos){
        System.out.println("Clientes Inativos");
        for (Cliente ci : clientesInativos) {
            System.out.println(ci);
        }
    }

    public static void listaGastos(List<ClienteComum> comumList, List<ClienteVIP> vipList){
        List<Double> valores = new ArrayList<>();

        System.out.print("Cliente comum[1] ou VIP[2]: "); int tipo = SC.nextInt();
        if(tipo == 1){
            Map<ClienteComum, List<Double>> clienteComumListMap = new HashMap<>();
            int size = comumList.size();
            for (int i = 0; i < size; i++) {
                System.out.println("\nNome do cliente "+ (i+1) + ": "+ comumList.get(i).getNome());
                System.out.print("Hospedagem: "); Double h = SC.nextDouble();
                valores.add(h);
                System.out.print("Alimentação: "); Double a = SC.nextDouble();
                valores.add(a);

                comumList.get(i).setGastoTotal(h + a);

                clienteComumListMap.put(comumList.get(i), valores);
                for (Map.Entry<ClienteComum, List<Double>> association : clienteComumListMap.entrySet()) {
                    System.out.println("----------");
                    System.out.println("Nome: " + association.getKey().getNome());

                    System.out.println("Gastos ");
                    for (Double p : association.getValue()) {
                        System.out.println("R$" + p);
                    }
                    System.out.println("----------");
                    break;
                }
                valores.clear();
            }

        } else if(tipo == 2) {
                Map<ClienteVIP, List<Double>> clienteVIPListMap = new HashMap<>();
                int size = vipList.size();
                for (int i = 0; i < size; i++) {
                    System.out.println("\nNome do cliente " + (i + 1) + ": " + vipList.get(i).getNome());
                    System.out.print("Hospedagem: ");
                    Double h = SC.nextDouble();
                    valores.add(h);
                    System.out.print("Alimentação: ");
                    Double a = SC.nextDouble();
                    valores.add(a);

                    vipList.get(i).setGastoTotal(h + a);

                    clienteVIPListMap.put(vipList.get(i), valores);
                    for (Map.Entry<ClienteVIP, List<Double>> association : clienteVIPListMap.entrySet()) {
                        System.out.println("----------");
                        System.out.println("Nome: " + association.getKey().getNome());

                        System.out.println("Gastos ");
                        for (Double p : association.getValue()) {
                            System.out.println("R$" + p);
                        }
                        System.out.println("----------");
                    }
                    valores.clear();
                }
            }
        }

    public static void realizaVendas(List<ClienteComum> comumList, List<ClienteVIP> vipList){
        System.out.print("Cliente comum[1] ou VIP[2]: ");
        int tipo = SC.nextInt();

        System.out.print("Digite o indice do cliente: "); int indice = SC.nextInt();
        if(tipo == 1) {
            int size = comumList.size();
            for (int i = 0; i < size; i++) {
                if (indice == i) {
                    System.out.println("\nCliente: " + comumList.get(i).getNome() + " | CPF: " + comumList.get(i).getCpf());
                    System.out.print("Nome do produto: ");
                    SC.nextLine();
                    System.out.print("Valor do produto: ");
                    Double val = SC.nextDouble();

                    comumList.get(i).setGastoTotal(comumList.get(i).getGastoTotal() + val);
                }
            }
            } else if(tipo == 2) {
                int size = vipList.size();
                for (int i = 0; i < size; i++) {
                    if (indice == i) {
                        System.out.println("\nCliente: " + vipList.get(i).getNome() + " | CPF: " + vipList.get(i).getCpf());
                        System.out.print("Nome do produto: ");
                        SC.nextLine();
                        System.out.print("Valor do produto: ");
                        Double val = SC.nextDouble();

                        vipList.get(i).setGastoTotal(vipList.get(i).getGastoTotal() + val);
                    }
                }
           }
    }

    public static int exibeOpcoes(){
        System.out.println("--------------------------------------");
        System.out.print(
                "[1] Cadastrar Cliente(Check-in)\n" +
                "[2] Realizar Check-out\n" +
                "[3] Listar clientes ativos\n" +
                "[4] Listar clientes inativos\n" +
                "[5] Listar gastos\n" +
                "[6] Realizar venda\n" +
                 "[0] Sair do programa\n");
        System.out.println("--------------------------------------");
        System.out.print("Escolha uma opção: ");
        int op = SC.nextInt();
        return op;
    }
}
