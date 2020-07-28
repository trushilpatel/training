package example;

class singlton{
    private static singlton s = new singlton();

    private singlton(){}

    public static singlton getSingleton(){
        return s;
    }

    public void print(){
        System.out.println("Hello this is singlton class");
    }

}

public class singltonClassExa {
    public static void main(String[] args) {
        singlton s =  singlton.getSingleton();
        s.print();


    }
}
