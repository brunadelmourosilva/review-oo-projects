package conta_pf_pj;

public class ContaPJ extends Conta{
    private String cnpj;

    public ContaPJ(String titular, double saldo, String numero, String cnpj){
        super(titular, saldo, numero);
        this.setCnpj(cnpj);
    }

    @Override
    public String toString() {
        return super.toString() + " cnpj=" + this.getCnpj() + "\'}";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
