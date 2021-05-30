package hotel_system.classes;

import java.util.Objects;

public abstract class Cliente {
    private String nome;
    private String cpf;
    private String dtCheckin;
    private String dtCheckout;
    private double gastoTotal;

    private static String nome_hotel;

    public Cliente(String nome, String cpf, String dtCheckin) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtCheckin = dtCheckin;
    }

    @Override
    public String toString() {
        if(this.dtCheckout == null)
            this.dtCheckout = "*";
        return "Cliente -> " +
                "nome = '" + nome + '\'' +
                ", cpf = '" + cpf + '\'' +
                ", dtCheckin = '" + dtCheckin + '\'' +
                ", dtCheckout = '" + getDtCheckout() + '\'' +
                ", gastoTotal = R$" + gastoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtCheckin() {
        return dtCheckin;
    }

    public void setDtCheckin(String dtCheckin) {
        this.dtCheckin = dtCheckin;
    }

    public String getDtCheckout() {
        return dtCheckout;
    }

    public void setDtCheckout(String dtCheckout) {
        this.dtCheckout = dtCheckout;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public static String getNome_hotel() {
        return nome_hotel;
    }

    public static void setNome_hotel(String nome_hotel) {
        Cliente.nome_hotel = nome_hotel;
    }
}
