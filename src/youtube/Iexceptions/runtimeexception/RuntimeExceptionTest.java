package br.com.brunadelmouro.youtube.Iexceptions.runtimeexception;

public class RuntimeExceptionTest {

    public static void main(String[] args) {

       /* //tipos de exceções do tipo checked e unchecked
        //aritimethic exception
        int c = 10 / 0;
        System.out.println(c);
        //NullPointerException - objeto nulo ou não referenciado
        Object o = null;
        System.out.println(o.toString()); */

        try{
            divisao(14, 0);
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    private static void divisao(int num1, int num2) throws IllegalArgumentException{
        if(num2 == 0)
            throw new IllegalArgumentException("denominador da divisão igual a 0"); //passa msg ao construtor

        int result = num1 / num2;
        System.out.println(result);
    }
}
