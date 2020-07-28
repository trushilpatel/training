package example.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

class abc implements Comparable<abc> {
    int val;

    abc(int a){
        this.val = a;
    }

    @Override
    public int compareTo(abc o) {
        if (this.val > o.val){
            return -1;
        } else {
            return 1;
        }
    }
}

public class comparablePrac {
    public static void main(String[] args) {
        ArrayList<abc> a = new ArrayList<>();

        for (int i = 10; i < 15; i++) {
            a.add(new abc(i));
        }
        for (abc temp : a) {
            System.out.println(temp.val);
        }
        Collections.sort(a);

        for (abc temp : a) {
            System.out.println(temp.val);
        }
    }
}
