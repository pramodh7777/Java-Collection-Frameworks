// uaing hashMap and PriorityQueue
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
        

        
    };

public class priorityQueuekTopFreq1 {
       static void kTopFreq(int arr[], int k)
       {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
        m.put(arr[i],m.getOrDefault(arr[i], 0)+1);
        
        }
        System.out.println(m);
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>(new MyCmp());
        pq.addAll(m.entrySet());

        for(int i=0;i<k;i++)
        {
            System.out.println(pq.poll().getKey());
        }



    }
        

    public static void main(String[] args) {
         int[] arr={10, 20, 10, 30, 10, 20, 30};
     int k=2;
     
     kTopFreq(arr,k);
    }
}
