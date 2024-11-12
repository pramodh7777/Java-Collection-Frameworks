import java.util.*;
public class ArraysClassComparator {
    public static void main(String[] args) {
        int a[] ={10,20,15};
        int b[] = {10,20,30};
        int res = Arrays.compare(a,b);
        if(res==0)
        {
            System.out.println("same");
        }
        else if(res>0)
        System.out.println("a is Greater ");
        else
        System.out.println("a is Smaller");
        String d[]= {"GeeksforGeeks", "IDE"};
        String e[]={"geeksforgeeks", "ide"};
        
        if(Arrays.compare(d, e, String::compareToIgnoreCase)==0)
        System.out.println("yes");
        else
        System.out.println("NO");
        }
}
