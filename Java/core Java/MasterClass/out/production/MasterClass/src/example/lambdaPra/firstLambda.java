package example.lambdaPra;

interface lamExa{
    void print();
};

public class firstLambda {
    public static void main(String[] args) {

        lamExa le = ()-> {
            System.out.println("hello this is my first java lambda expression");
        };

        le.print();
        lamExa temp = le;

        le = ()-> System.out.println("This is second string on ...");
        le.print();
    }
}
