import java.util.*;
public class ArrayClassFill {
public static void main(String[] args) {
    int arr[] = {10,20,30};
    Arrays.fill(arr,-1);
    System.out.println(Arrays.toString(arr));
    Arrays.fill(arr,1,3,-5);
    System.out.println(Arrays.toString(arr));
    ///for two dimentional
    int arr1[][] = new int[3][4];
    for(int [] row:arr1)
    {
        Arrays.fill(row, 1);
        System.out.print(Arrays.toString(arr));
    }


}
}
