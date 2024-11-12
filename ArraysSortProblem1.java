//all the even numbers should comes first then odd numbers
import java.util.*;
class comptr implements Comparator<Integer>
{
    public int compare(Integer a , Integer b)
    {
        return a%2-b%2;
    }
}
public class ArraysSortProblem1 {
    public static void main(String[] args) {
        Integer arr[] = {10,3,4,5,3,2,5,7,9,8};
        Arrays.sort(arr, new comptr());
        System.out.println(Arrays.toString(arr));

        
    }
}
