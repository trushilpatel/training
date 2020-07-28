package example;

import java.util.Scanner;

public class StringPrac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String st = s.nextLine();
        System.out.println("STRING : " + st);

        StringBuilder sb = new StringBuilder(st);
        System.out.println("String Builder : " + sb);

        sb.append(5);
        sb.deleteCharAt(2);
        String array[] = sb.toString().split(" ");

        for(String ss: array){
            System.out.println(ss);
        }

    }
}
