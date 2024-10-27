import java.util.*;
public class ArrayDeque1 {
     public static void main(String[] args) {
        Deque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println("elements after using add()"+ ad);
        ad.push(40);
        ad.push(50);
        ad.push(60);
        

        System.out.println("elements after using push()"+ ad);
        ad.peek();
        
        System.out.println("elements after using peek()"+ ad);
        ad.pop();
        System.out.println("elements after using pop()"+ ad);
        ad.peek();
        
        System.out.println("elements after using peek()"+ ad);
        ad.poll();
        System.out.println("elements after using poll()"+ ad);
        ad.remove();
        
        System.out.println("elements after using remove()"+ ad);
        ad.remove();
        
        System.out.println("elements after using remove()"+ ad);
        ad.offer(1000);
        ad.offer(2000);
        System.out.println("elements after using offer()"+ ad);
        
        

     }
}
