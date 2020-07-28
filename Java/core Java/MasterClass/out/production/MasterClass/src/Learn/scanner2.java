package Learn;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name :");

        String name = s.next();
        int i = s.nextInt();
        System.out.println(name + " " + i);
        name = s.nextLine();
        System.out.println(name);
    }
}
