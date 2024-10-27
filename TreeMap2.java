///Design a Data Structure of Prices and Items where dupicates are not allowed.
import java.util.*;
class MyDs{
    TreeMap<Integer,String> m;
    MyDs()
    {
        m = new TreeMap<>();
    }
    void add(int price, String item)
    {
        m.put(price,item);
    }
    String find(int price)
    {
        String res =m.get(price);
        if(res==null)
        {
            return " ";
        
        }
        else return res;
    }
    void PrintSorted()
    {
        for(Map.Entry<Integer,String> e : m.entrySet())
        {
            System.out.println(e.getValue()+ " "+ e.getKey());
        }
    }
    void PrintGreatedSorted(int price)

    {
        SortedMap<Integer,String> g = m.tailMap(price);
        for(Map.Entry<Integer,String> e : g.entrySet())
        {
            System.out.println(e.getValue()+ " "+ e.getKey());
        }
    }
    void PrintSmallerSorted(int price)

    {
        SortedMap<Integer,String> s = m.headMap(price);
        for(Map.Entry<Integer,String> e : s.entrySet())
        {
            System.out.println(e.getValue()+ " "+ e.getKey());
        }
    }

}



public class TreeMap2 {


    public static void main(String[] args) {
        MyDs ds = new MyDs();
        
        ds.add(5,"xyz");
        ds.add(10,"abc");
        ds.add(50,"pqr");
        
        System.out.println("printGreaterSorted:");
        ds.PrintGreatedSorted(7);
        
        System.out.println("printSmallerSorted:");
        ds.PrintSmallerSorted(50);
        
        System.out.println("printSorted:");
        ds.PrintSorted();
    }
}
