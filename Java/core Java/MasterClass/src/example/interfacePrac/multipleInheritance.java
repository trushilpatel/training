package example.interfacePrac;

import example.ArrayListExample;

interface sumOfTwo{
    default int sumOfTwo(int a, int b){
        System.out.println("two");
        return a+b;
    }
}

interface sumOfThree{
    int aa= 6;
    static int mm = 0;
    default int sumOfTwo(int a, int b){
        System.out.println("three");
        return a+b+a+b;
    }

    static int sumation(int a[]){
        int s = 0;
        for(int i: a){
            s +=  i;
        }
        return s;
    }

    int sumOfThree(int a, int b, int c);
}

class sum implements sumOfTwo, sumOfThree{

    @Override
    public int sumOfThree(int a, int b, int c) {
        System.out.println(sumOfTwo.super.sumOfTwo(5,5));
        return a+b+c;
    }

    @Override
    public int sumOfTwo(int a, int b) {
        return 0;
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        sum s = new sum();
        System.out.println(s.sumOfTwo(2,3));
        System.out.println(s.sumOfThree(2,3,5));
        System.out.println(sumOfThree.sumation(new int[] {1,2,3,4,5,6} ));

    }
}
