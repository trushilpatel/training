package Learn.collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashSetPra {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(5);
        HashSet<Integer> sh = new HashSet<>(5);
        hs.add(null);
        System.out.println(hs);
        ArrayList<Integer> al = new ArrayList(5);
        ArrayList<Integer> la = new ArrayList(5);

        for (int i = 0; i< 10; i++){
            al.add(i);
            la.add(9-i);

            System.out.println("AL : " + al.hashCode());
            System.out.println("LA : " + la.hashCode());
        }

        System.out.println(al.hashCode() == la.hashCode());
        System.out.println(al == la);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(null);
        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(null);
        System.out.println(ts);
    }

}
