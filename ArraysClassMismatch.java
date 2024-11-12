import java.util.*;
public class ArraysClassMismatch {
    public static void main(String[] args) {
        int a[] ={10,20,30};
        int b[]={10,20,30};
        int c[]= {10,20,30,40};
        System.out.println(Arrays.mismatch(a,b));
        System.out.println(Arrays.mismatch(a,c));
        String d[]= {"GeeksforGeeks", "IDE"};
        String e[]={"geegsforgeeks", "course"};
        
        System.out.println(Arrays.mismatch(d, e, String::compareToIgnoreCase));
    }
}
