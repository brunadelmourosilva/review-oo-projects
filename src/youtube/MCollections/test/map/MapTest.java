package br.com.brunadelmouro.youtube.MCollections.test.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("vc", "você");
        map.put("mose", "mouse");
        map.put("blz", "beleza");

        //HashMap n garante a ordem de iserção, por isso vamos utlizar o LinkedHashMap
        //iterar sobre as chaves
        for (String key: map.keySet()) { //ou values
            System.out.println(key);
        }
        System.out.println("----------------");
        //chamar key and value
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->"+ entry.getValue());
        }
    }
}
