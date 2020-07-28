package Learn.lambdaExa;

interface print{
    void print();
}

public class basicExam {
    public static void main(String[] args) {
        int a=0;
        print p = ()-> {

            System.out.println("Helllo " + a);
        };
        p.print();
    }
}
