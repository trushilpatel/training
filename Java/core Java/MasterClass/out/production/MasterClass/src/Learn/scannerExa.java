package Learn;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class scannerExa {
    public static void main(String s[]){
        System.out.println("Enter the value :");
        int a;
        float b ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextFloat();

        System.out.println(a*b);
    }
}
