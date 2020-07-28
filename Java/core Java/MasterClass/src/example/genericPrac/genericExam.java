package example.genericPrac;

class gen<T extends Number, D>{
    <M extends Number> gen(M m){

    }
    public void print(T a,D c){

        System.out.println(a + " " + c);
    }

    public static <M,N,P> void  print(M m, N n, P p){
        System.out.println("No arguments are given");
        System.out.println(m + " " + n + " " + p);
    }
}

public class genericExam {
    public static void main(String[] args) {
        gen<Integer, String> g = new gen<>(5);
        gen<Double, Integer> m = new gen<Double, Integer>(3);
        System.out.println(m.equals(g));
        g.print(5, "Trushil");
        gen.print(5,6,"hey");

    }
}