import java.util.*;
class cmp2 implements Comparator<Map.Entry<Integer,Integer>>
{
    public int  compare(Map.Entry<Integer,Integer> m1, Map.Entry<Integer,Integer> m2)
    {
        if(m1.getValue()==m2.getValue())
        {
            return m1.getKey()-m2.getKey();
        }
        else
        return m2.getValue()-m1.getValue();
    }
}
public class ArraysSortFrequency {
     static void SortByFreq(int arr[])
    {
        Map<Integer,Integer> m = new HashMap<>();
        for(int x:arr)
        {
            m.put(x,m.getOrDefault(x,0)+1);
        }
        // System.out.println(m);
        List<Map.Entry<Integer,Integer>> al = new ArrayList<>(m.entrySet());
        Collections.sort(al, new cmp2());
        int index=0;
        for(Map.Entry<Integer,Integer> e : al)
        {
            for(int i=0;i<e.getValue();i++)
            {
                // arr[index++] = e.getValue();
                arr[index++] = e.getKey();
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2,2,2,1,1,6,7,6,76,5,6,7,8,};
        SortByFreq(a);
        for (int x : a) {
            System.out.print(x + " ");
    }
}
}
