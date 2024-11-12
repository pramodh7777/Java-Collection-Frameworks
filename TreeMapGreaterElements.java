
import java.util.*;
public class TreeMapGreaterElements {
    static void greaterElement(int arr[])
    {
        TreeMap<Integer,Integer> m = new TreeMap<>(Collections.reverseOrder());
        for(int i =0;i<arr.length;i++)
        {
            
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);

        }
            int freq=0;
            for(Map.Entry<Integer,Integer> e : m.entrySet())
        
        {
            int temp = e.getValue();
            m.put(e.getKey(),freq);
            freq=freq+temp;



        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Greater Elements Count: " + entry.getValue());
        }
        
    }

    

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,3,7,8,7,8,6,5,3};
greaterElement(arr);
    }
}
