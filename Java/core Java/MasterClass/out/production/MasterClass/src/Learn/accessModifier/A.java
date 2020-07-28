package Learn.accessModifier;

import Learn.accessModifier.B;

public class A extends B {
    public static void main(String[] args) {
        A a = new A();
        a.a = 19;
        System.out.println(a.a);
    }
}
