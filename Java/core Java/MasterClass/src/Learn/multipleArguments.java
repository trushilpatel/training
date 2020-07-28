package Learn;

public class multipleArguments {
    static int sum(int ...z){
        System.out.println(z);
        for(int i:z){
            System.out.println(i);
        }
        return 0;
    }

    public static void main(String[] args) {
        sum(1,2,3,4,5,7);
    }
}
