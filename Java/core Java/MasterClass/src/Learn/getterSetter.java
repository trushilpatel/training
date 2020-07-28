package Learn;

public class getterSetter {
    int a;
    String s;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        getterSetter gs = new getterSetter();
        gs.setA(50);
        gs.setS("Hello");
        System.out.println(gs.getA() + "\t" + gs.getS());
    }

}
