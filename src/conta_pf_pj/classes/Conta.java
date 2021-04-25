package conta_pf_pj.classes;

import java.util.Scanner;

public abstract class Conta {
    private static String nomeBanco;
    private String titular;
    private double saldo;
    private double rendimento;
    private String numero;
    private static Tipo tipo;

    public Conta(String titular, double saldo, String numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "NomeBanco='" + Conta.nomeBanco + '\'' +
                ", titular='" + this.titular + '\'' +
                ", saldo=" + this.saldo +
                ", tipo=" + this.tipo +
                ", rendimento=" + this.rendimento +
                ", numero='" + this.numero + '\'';
    }

    static {
        System.out.print("Nome completo do banco: ");
        Scanner sc  = new Scanner(System.in);
        Conta.setNomeBanco(sc.nextLine());
    }

    public static String getNomeBanco() {
        return nomeBanco;
    }

    public static void setNomeBanco(String nomeBanco) {
        Conta.nomeBanco = nomeBanco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public static Tipo getTipo() {
        return tipo;
    }

    public static void setTipo(Tipo tipo) {
        Conta.tipo = tipo;
    }
}
