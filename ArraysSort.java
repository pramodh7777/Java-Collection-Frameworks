import java.util.*;
public class ArraysSort {
    public static void main(String[] args) {
        int arr[] = {10,70,60,40};
        int a[] = {'b', 'b', 'a', 'c'};///[97, 98, 98, 99] given indexes when used int
        char b[] ={'b', 'b', 'a', 'c'};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        

    }
}
