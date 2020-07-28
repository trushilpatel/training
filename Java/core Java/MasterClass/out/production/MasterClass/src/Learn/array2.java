package Learn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int arr[][] = new int[5][];

        for (int i = 0; i< 5;i++){
            arr[i] = new int[i+1];
            for (int j = 0; j<i+1; j++){
                arr[i][j] = j;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr[3]);
    }
}
