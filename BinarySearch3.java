import java.util.*;
class Test{
    int x,y;
    Test(int x , int y)
    {
       this.x=x;
       this.y=y;
    }
  static  class MyCmp implements Comparator<Test>
    {
      public  int compare(Test t1 , Test t2)
        {
            return t1.x-t2.x;
        }
    }
}
public class BinarySearch3 {
    public static void main(String[] args) {
        Test arr[] = {new Test(10, 20), 
        new Test(20, 15), 
        new Test(25, 5),
        new Test(40, 100)};
        Arrays.sort(arr, new Test.MyCmp());
        Test t = new Test(20,15);
        int a = Arrays.binarySearch(arr, t, new Test.MyCmp());
        System.out.println(a);
    }
}
