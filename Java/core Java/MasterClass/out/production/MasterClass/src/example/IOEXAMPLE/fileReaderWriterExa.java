package example.IOEXAMPLE;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReaderWriterExa {
    public static void main(String[] args) {
        try {
            File f = new File("Hello.txt");
            if (f.createNewFile()) {
                System.out.println("new file created");
            }
            System.out.println("CAN write : " + f.canWrite());

            FileWriter fw = new FileWriter(f);
            fw.write("Hello kem cho");
            fw.close();

            FileReader fr = new FileReader(f);
            int b;
            do{
                b = fr.read();
                System.out.print((char)b);
            } while(b != -1);
            fr.close();
        } catch (IOException e){
                e.getStackTrace();
            }
    }
}

