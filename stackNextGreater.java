public class stackNextGreater {
    static void previousGreater(int arr[])
    {
        
        for(int i =0;i<arr.length;i++)
        {
            int pg =-1;
            for(int j=i+1;j<arr.length-1;j++)
            {
              if(arr[j]>arr[i])
              {
                pg=arr[j];
                break;
              }
            }
            System.out.println("index of "+  arr[i]  +" " +pg);
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {5,15,10,8,6,12,7};
        previousGreater(arr);
    }
}
