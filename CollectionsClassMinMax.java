import java.util.*;
class Point implements Comparable<Point>
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;

    }
    public int compareTo(Point p)
    {
        return this.x-p.x;
    }
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
    
}
public class CollectionsClassMinMax {
    public static void main(String[] args) {
        {
            List<Point> list = new ArrayList<Point>();
            list.add(new Point(5,20));
            list.add(new Point(25,10));
            list.add(new Point(10,40));
            Point p = Collections.max(list);
            System.out.println(p.x + " " + p.y);


        }
    }
}
