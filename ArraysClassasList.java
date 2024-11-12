import java.util.*;
public class ArraysClassasList {
    public static void main(String[] args) {
        //int a[]={10,20,30};
        String a[] ={"GFG", "IDE", "COURSES"};
        List<String> s = Arrays.asList(a);
        System.out.println(s);
        s.set(1,"Premium");
        System.out.println(s);
        System.out.println("APPLICATOINS OF asList()");
        ///Resversing an array
        Collections.reverse(s);
        System.out.println(s);
        System.out.println(Arrays.toString(a));
        


    }
}
