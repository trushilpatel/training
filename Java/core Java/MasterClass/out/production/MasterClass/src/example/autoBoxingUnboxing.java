package example;

public class autoBoxingUnboxing {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(5555));
        int a = 555;
        Integer A = Integer.valueOf(a);
        System.out.println(A.intValue());
    }
}
