import java.util.*;
public class ArraysCollectionsSortUserDefined {
   static class Point implements Comparable<Point>
    {
        int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p1)
    {
        return this.x-p1.x;
    }
    }
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(6, 10));
        list.add(new Point(5, 10));
        list.add(new Point(5, 10));
        Collections.sort(list);
        for(Point P : list)
        {
            System.out.println(P.x+ " "+P.y);
        }
    }
}
// can also be implemented by using the Comperator;