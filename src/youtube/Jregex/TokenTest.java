package br.com.brunadelmouro.youtube.Jregex;

public class TokenTest {
    public static void main(String[] args) {
        String str = "bruna2 delmoro1 da sil00va";
        String[] token = str.split("\\d"); //regex remove numeros

        for (String array:token) {
            System.out.print(array.trim() + " ");
        }
    }  
}
