

public class stackSpanProblem {
   static void printSpan(int arr[])
{
    
    for(int i =0;i<arr.length;i++){
        int span =1;
        for(int j=i-1;j>=0 && arr[j]<=arr[i];j--)
        {
            span++;
            
        }
        System.out.println(span+ " ");
    }
}
    public static void main(String[] args) {
        int arr[] ={2,4,5,6,4,2,7,6};
    printSpan(arr);
    }
}
