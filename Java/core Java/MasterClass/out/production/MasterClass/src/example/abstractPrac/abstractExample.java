package example.abstractPrac;

abstract class C{
    int a;
    static int aa;
    C(int a, int aa){
        this.a = a;
        C.aa = aa;
        this.aa = 100;
        System.out.println(this.aa);
    }
    abstract void print();
}

public class abstractExample extends C {
    abstractExample(int a, int aa) {
        super(a, aa);
    }

    @Override
    void print() {
        System.out.println("hello this is working");
        System.out.println(this.a);
    }

    public static void main(String s[]){
        abstractExample e = new abstractExample(1,2);
        e.print();
    }
}
