package Learn;

import Learn.collectionExamples.ArrayListExam;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

class  name implements  Comparable<name>{
    String name;

    name(String name){
        this.name = name;
    }

    @Override
    public int compareTo(name o) {
        return name.compareTo(o.name);
    }
}

class countryName implements Comparator<countryName>{
    String country;

    countryName(String country){
        this.country = country;
    }


    @Override
    public int compare(countryName o1, countryName o2) {
        return o1.country.compareTo(o2.country);
    }
}

public class comparableAndComparator {

    public static void main(String[] args) {
        ArrayList<name> names = new ArrayList<>();
        names.add(new name("Trushil"));
        names.add(new name("Harshil"));

        ArrayList<countryName> cn = new ArrayList<>();
        cn.add(new countryName("India"));
        cn.add(new countryName("England"));
        cn.add(new countryName("Australia"));

        Collections.sort(names);
        System.out.println(names);
        System.out.println(cn.toString());

        cn.sort(new countryName("hello"));
        for(countryName c: cn){
            System.out.println(c.country);
        }

        countryName c1 = new countryName("India");
        countryName c2 = new countryName("India");
        Integer a = 5;
        Integer b= 5;
        b = 19;
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c1.equals(c2));
    }
}
