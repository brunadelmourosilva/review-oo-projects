package br.com.brunadelmouro.youtube.MCollections.classes;

public class Celular {
    private String nome;
    private String IMEI;

    /*
    caracteristicas do método equals
    reflexivo: x.equals(x) tem que ser true para tudo diferente de null
    simétrico: para x e y diferente de null, se x.equals(y) == true, então y.equals(x) == true
    transitivo: para x, y, z diferente de null, se x.equals(y) == true, y.equals(x) == true, x.equals(z) == true,
    então y.equals(z) == true
    consistente: x.equals(y) deve sempre retornar o mesmo valor

    para hashcode:
    x.equals(y) == true então y.hashcode() == x.hashcode;
    y.hashcode() == x.hashcode não necessariamente deve retornar true
    x.equals(y) == false
    y.hashcode() != x.hashcode, x.equals(y) deverá ser false
     */

    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1; //chamando hashoce do objeto tipo String
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        //verificar se IMEI é do tipo celular
        if(this.getClass() != obj.getClass()) return false;

        Celular refOutroCelular = (Celular) obj;
        return IMEI != null ? IMEI.equals(refOutroCelular.getIMEI()) : false;//veririfcar se o IMEI do objeto(classe) é IGUAL ao objeto passado(obj)
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
