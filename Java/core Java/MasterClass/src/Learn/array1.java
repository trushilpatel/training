package Learn;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int arr[];
        Scanner s = new Scanner(System.in);
        arr = new int[s.nextInt()];

        int n = arr.length;

        for (int i : arr){
            System.out.println(i);
        }

        int ar[] = {5,4,7,6,9,1000};
        int br[] = ar;
        System.out.println(Arrays.toString(br) + "   " + Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
