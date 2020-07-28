package example;

enum e{
    a(1),b(2),c(3),d(4);

    int value ;
    e(int temp){
        value = temp;
    }

    void printValue(){
        System.out.println(this.toString() + " " + value);
    }
}

public class enumExam {
    public static void main(String[] s){
        for(e a: e.values()){
            System.out.println(a);
        }
        e.a.printValue();
    }
}
