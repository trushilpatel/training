import java.util.Arrays;
import java.util.Collections;

class A{
    int a;
    A(int a){
        this.a = a;

    }
    void print(){
        System.out.println("Inside A");
    }
}

class B extends A{
    int b;
    B(int a,int b){
        super(a);
        this.b = b;
    }
    @Override
    void print(){
        super.print();
        System.out.println("Inside B");
    }
}
public class Main {

    public static void main(String args[]){
        int[] a = new int[5];
        int b[] = a;
        System.out.println(Arrays.equals(b, a));
        for (int value : b) {
            System.out.println(value);
        }
        array(a,b);
        System.out.println((Arrays.equals(a,b)));

    }

    public static void array(int[] a, int[] b){
        System.out.println(Arrays.equals(a,b));
        b = new int[10];
        System.out.println((Arrays.equals(a,b)));

    }
}
