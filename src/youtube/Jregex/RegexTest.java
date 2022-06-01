package br.com.brunadelmouro.youtube.Jregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        String text = "ababab";
        String find = "ab";
        Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto: " + text);
        System.out.println("Padrão a procurar: " + find);
        System.out.println("Posições encontradas:");
        while(matcher.find()){
            System.out.println(matcher.start() + " ");
        }

    }
}
