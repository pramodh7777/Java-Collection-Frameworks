import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
         List<String> list = new ArrayList<>();
        list.add("gfg");
        list.add("ide");
        list.add("course");
        System.out.println(list);
        list.add(1,"practice");
        System.out.println(list);
        list.add("pramodh");
        System.out.println(list);
        System.out.println(list.contains("pramodh"));
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.remove("ide"));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list);
        System.out.println(list.set(1, "monkey"));
        System.out.println(list);

    }
    
}
