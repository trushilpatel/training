package example.lambdaPra;

interface hi{
    void print(String s);
}

public class argumentLam {

    void execute(hi h, String s){
        h.print(s);
    }

    public static void main(String[] args) {
        //var i = 9;
        argumentLam al = new argumentLam();

        //al.execute((s) -> System.out.println(i + " " + s), "Kem choo majama ");

    }

}
