package br.com.brunadelmouro.youtube.Iexceptions.checkedexception.test;

import java.io.File;
import java.io.IOException;

/*
* Exceções do tipo "Checked" são classes filhas de Exception diretamente*/
public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
        createFile();
        openFile();
    }


    public static void createFile() throws IOException{
        File f = new File("Test.txt");

        //tratando exceção com os blocos try catch
        try {
            if(f.createNewFile())
                System.out.println("Successfully");
            else
                System.out.println("Error");
        } catch (IOException e) {
            //return a void function
            e.printStackTrace();
            throw e; //lança a exceção novamente para quem chamou
        }
        System.out.println("Fora do bloco catch");
    }

    public static void openFile(){
        try {
            System.out.println("Open file");
            System.out.println("Reading file");
            System.out.println("Writing file");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Close file"); //executa indepedente se o try ou catch executou
        }
    }

}
