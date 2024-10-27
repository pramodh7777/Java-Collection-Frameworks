//Naive Solution

public class TreeSeT {
    static void rightCeiling(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            int diff = Integer.MAX_VALUE;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    diff = Math.min(diff,arr[j]-arr[i]);
                }
            }
            if(diff==Integer.MAX_VALUE)
            {
                System.out.print("-1");
            }
            else
            System.out.print((arr[i]+diff)+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={20,30,70,40,20,80};
       
        rightCeiling(arr);
    }
}
