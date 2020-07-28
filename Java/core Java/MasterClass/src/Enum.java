import java.util.Scanner;

enum x{
    a,
    b,
    c
}

public class Enum {
    enum level {
        Low,
        Medium,
        High
    };
    public static void main(String[] args) {
        for(level l: level.values()){
            System.out.println(l);
        }
        Scanner s = new Scanner(System.in);
        level l = level.Low;

        System.out.println(l);
    }
}