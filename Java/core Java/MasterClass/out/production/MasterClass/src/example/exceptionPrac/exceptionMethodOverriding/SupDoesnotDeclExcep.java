package example.exceptionPrac.exceptionMethodOverriding;

import java.io.IOException;

class superA {
    void print(){
        System.out.println("SuperA");
    }
}

class childB extends superA {
//    void print() throws IOException {
//        System.out.println("ChildA");
//    }

    void print() throws ArithmeticException{
        System.out.println("Child B");
        throw new ArithmeticException();

    }
}

public class SupDoesnotDeclExcep {
    public static void main(String[] args) {
        childB b = new childB();
        b.print();
    }
}
