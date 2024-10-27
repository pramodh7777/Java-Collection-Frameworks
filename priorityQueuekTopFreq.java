//using arra hashSet and ArrayList
import java.util.*;
class MyCmp implements Comparator<Map.Entry<Integer,Integer>>
    {
       public int compare(Map.Entry<Integer,Integer> m1, Map.Entry<Integer,Integer> m2)
       
        {
            if(m1.getValue()==m2.getValue())
            return m1.getKey()-m2.getKey();
            else
            return m2.getValue()-m1.getValue();
        }
        

        
    }
public class priorityQueuekTopFreq {


    static void kTopFreq(int arr[], int k)
    {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i =0;i<arr.length;i++)
        {
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            
        }
        ArrayList<Map.Entry<Integer,Integer>> al  = new ArrayList<>(m.entrySet());
    Collections.sort(al, new MyCmp());
        
        System.out.println(m);
        for(int i=0;i<k;i++)
        {
            
            System.out.println(al.get(i).getKey());
        }

    }
    

    public static void main(String[] args) {
        
     int[] arr={10, 20, 10, 30, 10, 20, 30};
     int k=2;
     
     kTopFreq(arr,k);
    }
}
