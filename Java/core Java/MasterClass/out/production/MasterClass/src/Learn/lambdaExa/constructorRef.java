package Learn.lambdaExa;

interface temp {
    kem60 print(String s);

}

class kem60{
    kem60(){
        System.out.println("default condtructor");
    }

    kem60(String name){
        System.out.println(name);
    }

    kem60(int i){
        System.out.println(i);
    }
}

public class constructorRef {
    public static void main(String[] args) {
        temp t = kem60::new;

        kem60 m = t.print("Trushil");

    }
}
