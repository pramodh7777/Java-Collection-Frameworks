import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            it.add(5);
            System.out.println(it.next());
        }
        // while (it.hasPrevious()) {
        //     System.out.println(it.previous());
        //     int x =(Integer)it.previous();
        //     it.set(x*2);
        //     System.out.println(it.previous());
        //     System.out.println(list);
            while (it.hasPrevious()) {
                int x = it.previous();
                System.out.println("Before modification: " + x);
                it.set(x * 2);  // Modify the value
                System.out.println("After modification: " + x * 2);
            }
            System.out.println(list);

        }
    



    }
    

