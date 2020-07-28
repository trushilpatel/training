package Learn;

import java.util.Arrays;
import java.util.Iterator;

public class stringHandling {
    public static void main(String[] args) {
        String name = new String("Trushil");
        String surname = new String("Patel");
        char[] nameArr = new char[name.length() + surname.length() + 5];

        System.out.println(name.length());
        System.out.println(name.concat(surname));

        String.join(" ", name , surname).getChars(0,12,nameArr, 0);

        System.out.println(nameArr);
        nameArr = name.toCharArray();
        System.out.println(nameArr);
        String split[] = "kem choo majama".split(" ");

        for (String s: split) {
            System.out.println(s);
        }
//        System.out.println(name.repeat(5));
    }
}
