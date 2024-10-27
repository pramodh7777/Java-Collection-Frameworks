import java.util.*;

public class priorityQueue1 {

    static void maximumCost(List<Integer> al , int sum)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(al);
        int res=0;
        while(sum>=0 && pq.isEmpty()==false && pq.peek()<=sum){
            sum = sum-pq.poll();
            res++;

        };
        System.out.println(res);

    }
    public static void main(String[] args) {
        Integer arr[] ={20,10,5,30,100};
       // List<Integer> al = new ArrayList<Integer>(Arrays.asList(arr));
       List<Integer> al = Arrays.asList(arr);
        maximumCost(al, 35);
        

    }
}
