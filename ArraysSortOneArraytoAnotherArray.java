import java.util.*;
class Pair{
    int first;
    char second;
    Pair(int f,char s)
    {
        first =f;
        second=s;
    }
}
class cmp implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2)
    {
        return p1.first-p2.first;
    }

}
public class ArraysSortOneArraytoAnotherArray {
    static void PrintSortedWithIndex(int a[],char b[])
    {
        int n = a.length;
        Pair arr[] = new Pair[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = new Pair(a[i], b[i]);
        }
        Arrays.sort(arr,new cmp());
        for(int i =0;i<n;i++)
        {
            
            b[i] = arr[i].second;
        }

    }
    public static void main(String[] args) {
        int a[] = {2,6,4,7,5};
        char b[]={'w','r','q','t','g'};
        PrintSortedWithIndex(a,b);
        for(int i = 0; i<b.length; i++)
        System.out.print(b[i] + " ");

    }
}
// The loop with b[i] = arr[i].second; updates b as follows:

// b[0] = 'w' (from arr[0].second)
// b[1] = 'q' (from arr[1].second)
// b[2] = 'g' (from arr[2].second)
// b[3] = 'r' (from arr[3].second)
// b[4] = 't' (from arr[4].second)