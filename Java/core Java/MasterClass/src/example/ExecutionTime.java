package example;

public class ExecutionTime {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        int i = 0;
        double d = Math.pow(2,31);
        for(;i<1_000_000; i++){
            d = Math.pow(2,31);
        }
        System.out.print("int Variable :- ");
        System.out.println(System.currentTimeMillis()- time);
    }
}
