package br.com.brunadelmouro.youtube.Pjdbc.dominio;

import lombok.Builder;
import lombok.Value;
import java.util.Objects;

//MODEL

@Value //classe imutavel
@Builder //construtor
public final class Producer {

    private final Integer id;
    private final String name;

//    public Producer(String name) {
//        this.name = name;
//    }
//
//    public static final class ProducerBuilder {
//        private Integer id;
//        private String name;
//
//        private ProducerBuilder() {
//        }
//
//        public static ProducerBuilder builder() {
//            return new ProducerBuilder();
//        }
//
//        public ProducerBuilder id(Integer id) {
//            this.id = id;
//            return this;
//        }
//
//        public ProducerBuilder name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Producer build() {
//            return null;
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Producer producer = (Producer) o;
//        return Objects.equals(id, producer.id) && Objects.equals(name, producer.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
