import java.util.*;

public class distintelementsHashSet {
    static void distintElements(int arr[])
    {
        HashSet<Integer> h = new HashSet<>();
        for(int i =0;i<arr.length;i++)
        {
            if(h.contains(arr[i])==false)
            {
                System.out.print(arr[i]);
                 h.add(arr[i]);
            }

        }
        System.out.println(h);
    }

    public static void main(String[] args) {
        int arr[] = {4,8,5,7,5};
        distintElements(arr);
    }
    }
    

