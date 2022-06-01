package br.com.brunadelmouro.youtube.Oclassesinternas;

public class ClasseInternaTest {
    private String name = "Bruna Delmouro";

    class Interna{
        public void verClasseExterna(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(ClasseInternaTest.this);
        }
    }

    public static void main(String[] args) {
        ClasseInternaTest externa = new ClasseInternaTest();


        ClasseInternaTest.Interna in = externa.new Interna();

        ClasseInternaTest.Interna in2 = new ClasseInternaTest().new Interna();

        in.verClasseExterna();
        in2.verClasseExterna();
    }
}
