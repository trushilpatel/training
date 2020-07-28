package Learn;

public class methodOverloading1 {
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static float sum(int a, int b, float c){
        return a+b+c *1000;
    }

    public static void main(String[] args) {
        System.out.println(methodOverloading1.sum(1,2, (float) 3));
    }
}
