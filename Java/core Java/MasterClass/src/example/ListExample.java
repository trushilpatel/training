package example;

import java.util.Collections;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i=0;i<10;i++){
            ll.add(i);
        }

        System.out.println(ll);

        System.out.println(ll.getLast());
        System.out.println(ll.getFirst());
        ll.addFirst(56);

        ll.addLast(63);
        Collections.sort(ll);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}

