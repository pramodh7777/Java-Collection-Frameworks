
import java.util.*;



public class ArrayList4 {
    static List<Integer> getSmaller(int arr[],int k)
    {
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<k)
            {
              al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        // int arr[] = {8,100,20,40,3,7};
        // int k=10;
        // for(int i =0;i<arr.length;i++)
        // {
        //     if(arr[i]<k)
        //     {
        //         System.out.println(arr[i]);
        //     }
        // }
        int arr[] =  {8,100,20,40,3,7};
        List<Integer> al = getSmaller(arr, 10);
        for(Integer x:al)
        {
            System.out.println(x);
        }
        
    }
}
