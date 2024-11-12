import java.util.*;
class arrayIteam{
    int x, y;
    arrayIteam(int x, int y)
{
    this.x=x;
    this.y=y;
}
}
class comptr implements Comparator<arrayIteam>
{
    public int compare(arrayIteam i1, arrayIteam i2)
    {
        return i1.x - i2.y;
    }
}

public class ArraysSortKeepingIndexes {
    static void PrintIndexSorted(int arr[])
{
    int n = arr.length;
    List<arrayIteam> list = new ArrayList<>();
    for(int i =0;i<n;i++)
    {
        list.add(new arrayIteam(arr[i], i));
    }
    
    Collections.sort(list, (ai1,ai2) -> (ai1.x - ai2.x));
    for(arrayIteam c:list)
    {
        System.out.println(c.x+" "+c.y);
    }
}
    public static void main(String[] args) {
        int arr[] = {20, 10, 5, 4};
    
        PrintIndexSorted(arr);
        
    }
}
