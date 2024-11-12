import java.util.*;
class Point implements Comparable<Point>
{
    int x,y;
    Point(int x, int y)
    {
        this.x=x;
        this.y=y;

    }
    public int compareTo(Point p1)
    {
        return this.x-p1.x;
    }
}


public class ArraysSortNonPemitive {
    public static void main(String[] args) {
        Point arr[] = {
                      new Point(10, 20),
                      new Point(3, 13),
                      new Point(5, 7)};
        Arrays.sort(arr);
        System.out.println(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i].x + " "+arr[i].y);
        }
    }
}
////can also implemets using class mycmp implements <Point> 