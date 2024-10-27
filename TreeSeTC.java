import java.util.*;
public class TreeSeTC {
    static void rightCeiling(int arr[])
    {
        int n = arr.length;
        TreeSet<Integer> t =  new TreeSet<>();
        int res[] = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            Integer ceil = t.ceiling(arr[i]);
            if(ceil==null)
            res[i] = -1;
            else
            res[i]=ceil;
            t.add(arr[i]);
        }
        System.out.println("treeSet values"+t);
        for(int x :res)
        {
            System.out.print(x+" ");
        }
    }


    public static void main(String[] args) {
        int arr[]={20,30,70,40,20,80};
       
        rightCeiling(arr);
    }
}
