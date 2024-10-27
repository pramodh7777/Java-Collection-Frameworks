

public class printFrequency {
    static void PrintFreq(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            boolean flag = false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=true;
                    break;

                }
            }
            if(flag==true)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,10,10};
        PrintFreq(arr);
    }
}
