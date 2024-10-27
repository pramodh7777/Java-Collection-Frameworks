import java.util.*;
public class HashLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>(5,4.6f,true);
        // LinkedHashMap<Integer,String> m = new LinkedHashMap<>();

        m.put(1,"gfg");
        m.put(2,"course");
        m.put(3,"idle");
        System.out.println("before removinng key"+m);
        m.remove(1);
        System.out.println("after removinng key"+m);
        m.get(2);
        System.out.println(m);

    }
}
