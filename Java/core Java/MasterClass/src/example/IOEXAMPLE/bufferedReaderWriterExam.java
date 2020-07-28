package example.IOEXAMPLE;

import java.io.*;
import java.nio.Buffer;

public class bufferedReaderWriterExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(br.read());

        br.readLine();
        FileOutputStream fos = new FileOutputStream("FileExample.txt");
        //fos.write();

        System.out.println();
    }
}
