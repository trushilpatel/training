package example.annotationsPra;

import java.lang.annotation.*;
import java.lang.reflect.Type;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(multiAnno.class)
@interface anno{
    int value();
    String s();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface multiAnno{
    anno[] value();
}
@anno(value = 5,s = "hello")
@anno(value = 10, s= "kem 6o")
public @anno(value=29, s="kem") class ReapeatedAnnot {
    public static void main(String[] args) {
        ReapeatedAnnot ra = new ReapeatedAnnot();

        for(Annotation a: ReapeatedAnnot.class.getAnnotations()){
            System.out.println(a);
        }
    }
}
