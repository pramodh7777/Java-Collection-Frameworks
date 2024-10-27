import java.util.*;
public class TreeMap1 {
    public static void main(String[] args) {
      TreeMap<Integer,String> m = new TreeMap<>();
      m.put(10,"gfg");
      m.put(15,"course");
      m.put(5,"ide");
     
      
        System.out.println(m);
        for(Map.Entry<Integer,String> e : m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());

        }
        System.out.println(m.higherKey(10));
        System.out.println(m.lowerKey(10));
        System.out.println(m.floorKey(10));
        System.out.println(m.ceilingKey(10));
        System.out.println(m.higherEntry(10).getValue());
        System.out.println("Value for higher key than 10: " + m.get(m.higherKey(10)));
        System.out.println(m.higherEntry(10).getValue());

    

      

    }
}
