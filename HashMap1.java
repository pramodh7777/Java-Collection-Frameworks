import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> m= new HashMap<>();
        m.put(1,"gfg");
        m.put(2,"course");
        m.put(3,"idle");
        System.out.println(m);
        for(Map.Entry<Integer,String> e :m.entrySet())
        {
            System.out.println(e);
            System.out.println("after  this insertion e.getKey()+ \" \"+e.getValue()");
            System.out.println("output"+ " " +e.getKey()+ " "+e.getValue());
        }
        m.remove((1));
        System.out.println(m);
        m.replace(2, "pramodh");
        System.out.println(m);
       
       Set<Integer> keySet = m.keySet();
       System.out.println(keySet);
       Collection<String> c = m.values();
         System.out.println(c);
System.out.println();



    }
}
