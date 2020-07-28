package example.exceptionPrac;

class userDefinedExce extends Exception{
    userDefinedExce(String s){
        super(s);
    }
}

public class userDefinedException {
    public static void main(String[] args) throws userDefinedExce {
    try{
        throw new userDefinedExce("this is user define Exception");
    } catch(userDefinedExce e) {
        System.out.println(e);
        e.printStackTrace();
    }

    }
}
