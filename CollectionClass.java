import java.util.*;
public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        ////Fill method;
        Collections.fill(al,5);
        System.out.println(al);
        al.add(20);
        al.add(30);
        al.add(10);
        
        System.out.println(al);
        //sorting
        Collections.sort(al);
        System.out.println(al);
        //reverse
        Collections.reverse(al);
        System.out.println(al);
        //binary search
        System.out.println(Collections.binarySearch(al,10));
        //min and max
        System.out.println(Collections.min(al));
        System.out.println(Collections.max(al));




    }
}
