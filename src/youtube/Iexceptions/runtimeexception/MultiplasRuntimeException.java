package br.com.brunadelmouro.youtube.Iexceptions.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeException {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro de ArrayIndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("dentro de IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("dentro de ArithmeticException");
        }


        //multi-catch
        try {
            talvezExcecao();
        } catch (SQLException |  IOException e){

        }


    }
    private static void talvezExcecao() throws SQLException, FileNotFoundException{

    }
}
