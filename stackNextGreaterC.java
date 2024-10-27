import java.util.*;
public class stackNextGreaterC {
    static void printNextGreater(int arr[])
    {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int  n =arr.length;
        stack.push(arr[n-1]);
       
        
        int res[] = new int[n];
        res[n-1]=-1;
        for(int i =n-2;i>=0;i--)
        {
            while(stack.isEmpty()==false && stack.peek()<=arr[i])
            {
                stack.pop();
            }
            res[i]=(stack.isEmpty()? -1:stack.peek());
             stack.push(arr[i]);

 
        }
        for(int i =0;i<n;i++)
        {
        System.out.println(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,15,10,8,6,12,7};
        printNextGreater(arr);
    }
}
