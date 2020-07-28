package example.exceptionPrac.exceptionMethodOverriding;

import java.io.IOException;

class A{
    int a;
    void print() throws IOException{
        System.out.println("Class A");
    }
    void printData() throws Exception{
        System.out.println("class A printData");
    }
    static void printHello(){
        System.out.println("Class A");
    }
}

class B extends A{
    int a;
    // following will give an error
    //void print() throws Exception(){}
    void print() {
        a = 50;
        super.a = 100;
        System.out.println("Class B");

    }
    void printData() throws ArithmeticException{
        System.out.println(a);
        System.out.println(super.a);
        throw new ArithmeticException();
    }
    static void printHello(){
        System.out.println("Class B");
    }
}


public class superDeclExce {
    public static void main(String[] args) {
        B b =  new B();
        b.print();
        b.printData();
    }

}
