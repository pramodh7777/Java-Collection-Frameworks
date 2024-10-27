import java.util.*;

public class priorityQueue2 {
    static void kLargestElements(int arr[], int k)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i=0;i<k;i++)
        {
        pq.add(arr[i]);
        }
        
        for( int i=k;i<arr.length;i++)
        {
        
            if(arr[i]>pq.peek())
            {
                
                pq.poll();
                pq.add(arr[i]);
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(pq.poll());
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,8,4};
        kLargestElements(arr, 1);
    }
}
