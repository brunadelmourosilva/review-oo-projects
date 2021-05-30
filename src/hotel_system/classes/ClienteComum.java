package hotel_system.classes;

public class ClienteComum extends Cliente implements Comparable<ClienteComum>{

    public ClienteComum(String nome, String cpf, String dtCheckin) {
        super(nome, cpf, dtCheckin);
    }

    @Override
    public int compareTo(ClienteComum o) {
        return this.getNome().compareTo(o.getNome());
    }

}
