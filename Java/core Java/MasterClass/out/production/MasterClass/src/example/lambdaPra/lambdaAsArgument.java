package example.lambdaPra;

interface i{
    hey print(int i, String s);
}

class hey{
    int a;
    String s;

    hey(){
        this.a = 0;
        this.s = "";
    }

    hey(String s,int a){
        this.a =a;
        this.s = s;
    }
    hey(int a, String s){
        this.a =a;
        this.s = s;
    }



    void general(){
        System.out.println("General method is calleld");
    }

    public static void main(){
        System.out.println("hey this is static main method");
    }

}

public class lambdaAsArgument {
    public static void main(String[] args) {

        hey h = new hey();
        i m = hey::new;
        hey hy = m.print(5,"Trushl");
        hy.main();
        hy.general();
    }
}
