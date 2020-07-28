package example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for(int i=0; i< 10; i++){
            ar.add(i);
        }

        System.out.println(ar);
        System.out.println(ar.get(5));

        ar.set(0,100);
        System.out.println(ar);

        ar.remove(5);
        System.out.println(ar);
        System.out.println(ar.size());

        // sorting the array
        Collections.sort(ar);
        System.out.println(ar);

        for (Integer integer : ar) {
            System.out.println(integer);
        }

        ar.clear();
        System.out.println(ar);


    }
}
