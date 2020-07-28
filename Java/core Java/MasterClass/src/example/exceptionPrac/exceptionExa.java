package example.exceptionPrac;

public class exceptionExa {
    public static void hi() throws ArithmeticException{
        try {
            int a = 5/0;
        } catch (ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
            throw(e);
        }
    }
    public static void main(String[] args) throws ArithmeticException{
        try{
            hi();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
