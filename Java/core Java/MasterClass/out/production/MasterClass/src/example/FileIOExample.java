package example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\trush\\IdeaProjects\\MasterClass\\src\\example\\JavaExample.txt");

            if (f.createNewFile()){
                System.out.println("New File Created");
            } else {
                System.out.println("File already exist");
            }

            FileWriter fw = new FileWriter("C:\\Users\\trush\\IdeaProjects\\MasterClass\\src\\example\\JavaExample.txt");
            fw.write("Hello this is first line in this file\n");
            fw.write("Hello this is second line ");

            fw.close();
            FileReader fr = new FileReader("C:\\Users\\trush\\IdeaProjects\\MasterClass\\src\\example\\JavaExample.txt");
            char c;
            do {
                c = (char)fr.read();
                System.out.print(c);

            }while ((byte)c != -1);

            Scanner s = new Scanner(f);
            while (s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            s.close();
            fr.close();
            boolean delete = f.delete();

            if (delete){
                System.out.println("sucessfully deleted");
            } else{
                System.out.println("Can't delete file");
            }
        } catch (IOException e){
            System.out.println("Error occurred while opening file");
            e.printStackTrace();
        }
    }
}