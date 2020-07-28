package example;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Trushil", "Patel");
        hm.put("Hello", "World");
        hm.put("Nothing", "EveryThing");

        System.out.println(hm);
        for(String s: hm.keySet()){
            System.out.println(s + " : " + hm.get(s));
        }

        hm.remove("Hell");
        System.out.println(hm);
    }
}
