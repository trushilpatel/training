package Learn.collectionExamples;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class liastPra {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<>();
        i.add(0,50);
        i.push(2);
        i.push(5);
        i.forEach(System.out::println);
        i.add(null);
        System.out.println(i);

    }
}
