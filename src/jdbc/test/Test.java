package jdbc.test;


import jdbc.repository.CompradorRepository;


public class Test {
    public static void main(String[] args) {

        //CompradorRepository.insert(new Comprador("Alex", "555.555.555.-78"));

        //CompradorRepository.findAll();

        //Comprador c = new Comprador("Natalia", "555.555.555.-78");
        //c.setId(2);
       // CompradorRepository.update(c);

        //CompradorRepository.findAll();

        //CompradorRepository.delete(c);

        //CompradorRepository.findAll();

        //CompradorRepository.namesToLowerCase();

        //CompradorRepository.findByNamePrepareStatament("lex");

        //CompradorRepository.updateByPrepareStatament(new Comprador(8, "PreparedStatament - 2", "000.000.000-00"));
        CompradorRepository.findByNamePrepareStatament("Pre");

        //CompradorRepository.findNameByCallableStatament("lex");

    }
}
