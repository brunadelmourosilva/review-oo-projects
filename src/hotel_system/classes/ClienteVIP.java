package hotel_system.classes;

public class ClienteVIP extends Cliente implements Comparable<ClienteVIP>{
    private double descontoVip;

    public ClienteVIP(String nome, String cpf, String dtCheckin) {
        super(nome, cpf, dtCheckin);
    }

    @Override
    public String toString() {
        return
                super.toString() +
                ", gastoTotalComDesconto='" +
                getDescontoVip() + '\'';
    }

    public double getDescontoVip() {
        return descontoVip;
    }

    public void setDescontoVip(double descontoVip) {
        this.descontoVip = descontoVip;
    }

    @Override
    public int compareTo(ClienteVIP o) {
        return this.getNome().compareTo(o.getNome());
    }

}
