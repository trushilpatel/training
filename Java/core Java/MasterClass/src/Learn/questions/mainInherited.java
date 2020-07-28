package Learn.questions;

class mainClassExample{
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

public class mainInherited {
    public static void main(String[] args) {
        System.out.println("mainInherited");
    }
    static {
        System.out.println("Static block in mainInherited");
        mainClassExample.main(null);

    }
}
