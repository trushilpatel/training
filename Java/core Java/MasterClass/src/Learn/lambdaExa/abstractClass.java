package Learn.lambdaExa;

import Learn.accessModifier.A;

abstract class AA{
    abstract void message();
}

interface II{
    void message();
}

public class abstractClass {
    public static void main(String[] args) {
        AA a  = new AA() {
            @Override
            void message() {
                System.out.println("hello");
            }
        };

        II i = new II() {
            @Override
            public void message() {
                System.out.println("hello this is me");
            }
        };
        a.message();
        i.message();
    }
}
