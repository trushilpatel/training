package Learn.genericExa;

class print <T>{
    void print(T t){
        System.out.println(t);
    }
}

public class gen1 {
    print<Integer> p = new print<Integer>();
}
