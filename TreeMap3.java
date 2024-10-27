///Design a Data Structure of Prices and Items where dupicates are  allowed.
import java.util.*;
class MyDs{
    TreeMap<Integer,List<String>> m;
    MyDs()
    {
        m = new TreeMap<>();
    }
    void add(int price, String item)
    {
        if(m.get(price)==null)
        {

        
        m.put(price, new ArrayList<>());
        }
        m.get(price).add(item);
    }
    List<String> find(int price)
    {
        return m.get(price);
    }
    void PrintSorted()
    {
        for(Map.Entry<Integer,List<String>> e : m.entrySet())
        {
            // System.out.println(e.getValue()+ " "+ e.getKey());
            int p=e.getKey();
            for(String s:e.getValue())
            {
                System.out.println(s+" "+p);
            }
        }
    }
    void PrintGreatedSorted(int price)

    {
        SortedMap<Integer,List<String>> g = m.tailMap(price);
        for(Map.Entry<Integer,List<String>> e : g.entrySet())
        {
            int p =e.getKey();
            for(String s :e.getValue())
            {
                System.out.println(s+" "+p);
            }
             System.out.println(e.getValue()+ " "+ e.getKey());
        }
    }
    void PrintSmallerSorted(int price)

    {
        SortedMap<Integer,List<String>> s = m.headMap(price);
        for(Map.Entry<Integer,List<String>> e : s.entrySet())
        {
            System.out.println(e.getValue()+ " "+ e.getKey());
        }
    }

}



public class TreeMap3 {


    public static void main(String[] args) {
        MyDs ds = new MyDs();
        
        ds.add(5,"abc");
        ds.add(5,"xyz");
        ds.add(10,"wxy");
        ds.add(10,"pqr");
        ds.add(20,"rst");
        ds.add(40,"bcd");
        
        System.out.println("printSorted:");
        ds.PrintSorted();
        
       ds.add(20,"cde");
       ds.add(2,"efg");
       
       System.out.println("printGreaterSorted:");
       ds.PrintGreatedSorted(15);
       
    }
}
