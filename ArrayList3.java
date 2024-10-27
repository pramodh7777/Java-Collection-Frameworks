import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {
    public static void main(String[] args) {
         List<String> list = new ArrayList<>();
        list.add("gfg");
        list.add("ide");
        list.add("course");
        for(int i =0;i<list.size();i++)
        {
            System.out.println(i);
        }
        for(String s:list)
        {
            System.out.println(s);
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(5);
        Iterator<Integer> it1 = list1.iterator();
        while (it1.hasNext()) {
            int x = (Integer)it1.next();
            if(x<10)
            {
                it1.remove();
            }

        }
        System.out.println(list1);

    }
    
}
