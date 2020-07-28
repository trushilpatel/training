package example.lambdaPra;

interface genLam<T,S>{
    void print(T t, S s);
}

public class genericLambda {

    public static void main(String[] args) {
        genLam print = (i,s) -> {
            System.out.println(i + " " + s);
        };

        print.print(5,"String");
    }
}
