package example.ioPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class readPrac {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        try {
            System.out.write(br.read());
            br.read();
            pw.println(br.readLine());
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
