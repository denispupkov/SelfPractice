package day11_Practices;

public class Test {

    public static void main(String[] args) {

        boolean x = true;
        boolean z = true;
        int y = 20;


       x = (y != 10) || (z = false);


        System.out.println("x = " + x);
        System.out.println("z = " + z);


        /*
        Module 'SelfPractice' production: java.lang.ClassCastException:
        class org.jetbrains.jps.builders.java.dependencyView.TypeRepr$PrimitiveType
        cannot be cast to class org.jetbrains.jps.builders.java.dependencyView.TypeRepr$ClassType
        (org.jetbrains.jps.builders.java.dependencyView.TypeRepr$PrimitiveType and
        org.jetbrains.jps.builders.java.dependencyView.TypeRepr$ClassType are in unnamed
        module of loader java.net.URLClassLoader @3419866c)

         */


    }
}
