package example.ioPrac;

import java.io.*;

public class fileOpes {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("JavaExample.txt");
            FileOutputStream fos = new FileOutputStream("Example.txt");

            int i;
            do {
                i = fis.read();
                fos.write((char)i);

            } while ( i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
