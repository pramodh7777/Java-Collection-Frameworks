import java.util.*;
public class ArraysSortChocoDistribution {
    static int minDiff(int arr[], int m)
    {
        if (m == 0 || arr.length == 0 || m > arr.length) {
            return -1; // Return -1 for invalid cases
        }
        if(m>arr.length)
        {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(arr);
        int res = arr[m-1]-arr[0];
        for(int i =0;(i+m-1)<arr.length;i++)
        {
            res = Math.min(res,(arr[i+m-1])-arr[i]);
        }
        return res;


    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,3,9,8,6};
        int m =3;
       int x = minDiff(arr, m);
       System.out.println(x);
    }
}
