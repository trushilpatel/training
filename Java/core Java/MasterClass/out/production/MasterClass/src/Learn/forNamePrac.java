package Learn;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class forNamePrac {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Class.forName("Learn.temp");
        Constructor o = c.getConstructor();
        Object ob = o.newInstance();
        ((temp)ob).print();
        System.out.println(ob);
        System.out.println(c);

    }
}
