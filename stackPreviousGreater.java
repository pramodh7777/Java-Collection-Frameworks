public class stackPreviousGreater {
    static void previousGreater(int arr[])
    {
        
        for(int i =0;i<arr.length;i++)
        {
            int pg =-1;
            for(int j=i-1;j>=0;j--)
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
        int arr[] = {60, 10, 20, 40, 35, 30, 50, 70, 65};
        previousGreater(arr);
    }
}
