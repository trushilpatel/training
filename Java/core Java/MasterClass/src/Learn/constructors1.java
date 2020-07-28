package Learn;

public class constructors1 {
    int a;
    String s;

    constructors1(){
        a = 0;
        s = "";
    }

    constructors1(int a, String s){
        this.a = a;
        this.s = s;
    }

    public static void main(String[] args) {
        constructors1 c = new constructors1(50,"this is me");
        System.out.println(c.a + "\t" + c.s);

    }
}
