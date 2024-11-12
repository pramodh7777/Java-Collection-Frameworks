import java.util.*;
public class CollecctionFequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(Collections.frequency(list, 10));
    }
}
