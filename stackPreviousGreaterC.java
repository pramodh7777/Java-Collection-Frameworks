import java.util.*;
public class stackPreviousGreaterC {
    static void printPrevousGreater(int arr[])
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(arr[0]);
        int pg=-1;
        System.out.println(pg+" ");
        for(int i =1;i<arr.length;i++)
        {
            while(stack.isEmpty()==false && stack.peek()<=arr[i])
            {
                stack.pop();
            }
            pg=(stack.isEmpty()? -1:stack.peek());
            System.out.println(pg+" ");
             stack.push(arr[i]);

 
        }
    }
    public static void main(String[] args) {
        int arr[] = {60, 10, 20, 40, 35, 30, 50, 70, 65};
        printPrevousGreater(arr);
    }
}
