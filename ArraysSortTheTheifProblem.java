import java.util.*;
public class ArraysSortTheTheifProblem {
     static int getMaxval(Integer arr[], int k)
{
    Arrays.sort(arr,Collections.reverseOrder());
    int res =0;
    for(int i =0;i<k;i++)
    {
        res = res+arr[i];

    }
    return res;
}
    public static void main(String[] args) {
        Integer arr[] = {3,7,2,5,12,30};
        int k =3;
       int r = getMaxval(arr,k);
        System.out.println(r);
    }
}
