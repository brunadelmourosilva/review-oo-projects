package br.com.brunadelmouro.youtube.Iexceptions.checkedexception.test;

import java.io.*;

public class TryWithResourceTest {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile(){
        try(Reader reader = new BufferedReader(new FileReader("Test.txt"))) { //abrindo arquivo txt

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

/*
* https://www.baeldung.com/java-try-with-resources
* */
