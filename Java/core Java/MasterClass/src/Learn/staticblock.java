package Learn;
import Learn.h;

class staticBlockk2{
    static {
        System.out.println("kem cho majama");
    }
}

public class staticblock extends staticBlock2 {
    static  String s;
    static int count = 10;
    int a =493;

    static {
        System.out.println(count);
        count = 100;
        System.out.println(s);
        staticblock sb = new staticblock();
    }
    static h H = new h();

    void pprint(){
        System.out.println("pp got called");
    }
    static void print(){

        System.out.println("kem chho majama");
    }
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        staticBlockk2 sb2 ;
        staticblock sb = new
                staticblock();
        System.out.println(count);
        System.out.println(staticblock.count);
        System.out.println(sb);
        System.out.println(Class.forName("Learn.staticBlockk2"));
        System.out.println(staticblock.class.isInstance(sb));

    }
}
