package Learn;

interface live{
    void name(String s);
    void gender(String s);
    void age(byte s);

    static void printStatic(){
        System.out.println("THis is the static method");
    }
    default void print(){
        System.out.println("hello this is default method of human interface");
    }
}

interface humans extends live {
    String className = "Human";
}

class human implements humans{
    String name;
    String gender;
    byte age;

    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void gender(String gender) {
        this.gender = gender;
    }

    @Override
    public void age(byte age) {
        this.age = age;
    }
}




public class interfaceAndAbstract {
    String main;
    public static void main(String[] args) {
        interfaceAndAbstract i = new interfaceAndAbstract();
        i.main = "This is main method";
        System.out.println(i.main);
        human h = new human();
        h.name("Trushil");
        h.age((byte) 20);
        h.gender("male");

        System.out.println(h.name + "   " + h.age + "   " + h.gender);
    }
}
