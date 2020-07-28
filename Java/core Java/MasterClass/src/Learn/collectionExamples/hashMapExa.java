package Learn.collectionExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class hashMapExa {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Trushil",56);
        hm.put("Prem", 44);

        System.out.println(hm.merge("Prem",50, Integer::sum));
        System.out.println(hm.toString());

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

    }
}
