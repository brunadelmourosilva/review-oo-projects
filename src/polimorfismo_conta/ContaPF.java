package polimorfismo_conta;

public class ContaPF extends Conta{
    private String cpf;

    public ContaPF(String titular, double saldo, String numero, String cpf) {
        super(titular, saldo, numero);
        this.setCpf(cpf);
    }

    @Override
    public String toString() {
        return  super.toString() + " cpf='" + this.getCpf() + "\'}";

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
