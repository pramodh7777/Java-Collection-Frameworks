//treat it as exeption while revising
import java.util.*;
public class priorityQueqekTopFreqLinearArray {

    static void kTopFreq(int arr[],int k)
    {
        int n=arr.length;
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i =0;i<n;i++)
        {
        m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        System.out.println(m);
        List<List<Integer>> frq = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            frq.add(new ArrayList<Integer>());
        }
        for(Map.Entry<Integer,Integer> x: m.entrySet())
        {
            frq.get(x.getValue()).add(x.getKey());
        }
        int count=0;
        for(int i=n; i>=0; i--)
        {
             for(int x: frq.get(i))
             {
                 System.out.println(x);
 
                 count++;
 
                 if(count==k)
                     return;
             }
        }
 }
    public static void main(String[] args) {
        int[] arr={10, 5, 20, 5, 10, 10, 30};
     int k=2;
     
     kTopFreq(arr,k);
        
    }
}
