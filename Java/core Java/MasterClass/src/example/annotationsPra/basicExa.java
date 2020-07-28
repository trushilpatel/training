package example.annotationsPra;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface annot{
    int value();
    String sValue();
}

@Retention(RetentionPolicy.RUNTIME)
@interface annots{
    int value();
    String sValue();
}


@annots(value = 50, sValue = "Hello")
@annot(value = 10, sValue = "First Example")
public class basicExa {

    @annot(value = 100, sValue = "Method annotation Example")
    public void myMeth(){
        basicExa b = new basicExa();

        try {
            Method m = this.getClass().getMethod("myMeth");
            annot a = m.getAnnotation(annot.class);
            System.out.println(a);
            Annotation anno[] = this.getClass().getAnnotations();
            System.out.println(anno);
            for(Annotation an: anno){
                System.out.println(an);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws NoSuchMethodException {
        basicExa be = new basicExa();
        System.out.println("hello " + basicExa.class.getAnnotation(annot.class));
        System.out.println("Hi " + basicExa.class.getAnnotation(annots.class));
        be.myMeth();
        System.out.println(basicExa.class.isAnnotationPresent(Override.class));
    }
}
