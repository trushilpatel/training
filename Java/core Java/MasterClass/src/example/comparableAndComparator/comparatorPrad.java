package example.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class a implements Comparator<a>{
    public String s;

    a(String s){
        this.s = s;
    }

    @Override
    public int compare(a o1, a o2) {
        return o1.s.compareTo(o2.s);
    }
}
public class comparatorPrad {
    public static void main(String[] args) {
        ArrayList<a> s = new ArrayList<>();
        s.add(new a("Trushil"));
        s.add(new a("Harshil"));
        s.add(new a("Sangita"));
        s.add(new a("Prahlad"));
        s.add(new a("Mahendra"));

        Collections.sort(s, new a("hello"));

        for(a A: s){
            System.out.println(A.s);
        }
    }
}
