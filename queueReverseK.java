import java.util.*;
public class queueReverseK {
    static void reverseK(Queue<Integer> q , int K)
    {
        if(q.size()<K || K<=0)
        return ;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int i =0;i<K;i++)
        {
        stack.push(q.poll());
        }
        
        System.out.println("stack elements"+stack);
        System.out.println("queue elements"+q);
        while (stack.isEmpty()==false) {
            q.offer(stack.pop());
        }
        
        System.out.println("queue elements after add stack elements"+q);
        for(int i=0;i<q.size()-K;i++)
        {
            q.offer(q.poll());

        }
        System.out.println("queue elements after sorting"+q);


    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(6);
        q.add(7);
        q.add(9);
        int k=3;
        System.out.println("queue elements"+q);

        reverseK(q,k);
        
    }
    
}
