package example.packagePrac.abc;

class abcd{
    protected void print(){
        System.out.println("hello this is me");
    }
}
public class abcClass {
    private void print(){
        System.out.println("abcClass PRINT method here");
    }

    public static void main(String[] args) {
        abcd a = new abcd();
        a.print();
    }
}

