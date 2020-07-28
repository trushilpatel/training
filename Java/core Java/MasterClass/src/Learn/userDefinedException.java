package Learn;

/** this is user defined exception **/
class printException extends Exception{
    printException(String description){
        super(description);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "now just go to hell";
    }
}

public class userDefinedException {
    /** this function throws exception ****** **/
    public void print() throws printException {
        throw new printException("why you printed...");
    }
    int s;
    String st;
    public static void main(String[] args){
        try {
            userDefinedException ude = new userDefinedException();
            System.out.println(ude);
            System.out.println(ude.s + "\n" + ude.st);

            ude.print();
        } catch (printException | NullPointerException p){
            System.out.println(p);
        } catch (Exception e){

            System.out.println(e);
        }
    }
}
