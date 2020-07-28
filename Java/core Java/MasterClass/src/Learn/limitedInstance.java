package Learn;

class RestrictedInstance {
    private static transient short maxInstance;
    private static transient short count;
    private static RestrictedInstance obj;

    String userName;

    static {
        // set maximum possible instance to 1
        maxInstance=1;
    }

    private RestrictedInstance(String userName){
        this.userName = userName;
    }

    // set maximum possible instance
    // initialize count and RestrictedInstance array
    public static synchronized void setMaxInstance(short maxInstance){
        RestrictedInstance.maxInstance = maxInstance;
    }

    public static synchronized RestrictedInstance getObj(String userName){
        if (count < maxInstance){
            RestrictedInstance.obj = new RestrictedInstance(userName);
            RestrictedInstance.count++;
        }
        return RestrictedInstance.obj;
    }

    public void print(){
        System.out.println("MaxInstance : " + maxInstance + "\n" +
                         "Total created instance : " + count );
        System.out.println("UserName : " + userName);
    }
}


public class limitedInstance {
    public static void main(String[] args) {
        RestrictedInstance.setMaxInstance((byte)2);
        RestrictedInstance ro = RestrictedInstance.getObj("Trushil Patel");
        System.out.println(ro);
        ro.print();

        System.out.println();

        RestrictedInstance ro2 = RestrictedInstance.getObj("Harshil Patel");
        System.out.println(ro2);
        ro2.print();

        System.out.println();

        //Here last created RestrictedInstance class object is returned
        RestrictedInstance ro3 = RestrictedInstance.getObj("Kevin Patel");
        System.out.println("RO3 equals RO2 : " + ro3.equals(ro2));
    }
}


