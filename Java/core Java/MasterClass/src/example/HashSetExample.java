package example;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Trushil");
        hs.add("Harshil");

        System.out.println(hs);
        System.out.println("Trushil".hashCode());
        Object s = hs;
        ((HashSet)s).add("Hello");
        System.out.println(hs);
        System.out.println(s);
    }
}
