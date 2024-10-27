

public class distintelements {
    static void distintElements(int arr[])
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
            if(flag==false)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,8,5,7,5};
        distintElements(arr);
    }
}
