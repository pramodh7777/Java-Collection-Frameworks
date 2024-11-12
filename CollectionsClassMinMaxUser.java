import java.util.*;
class Point
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;

    }
   
    
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
    
}

class Comp implements Comparator<Point>
{
    public int compare(Point p1, Point p2)
    {
        return p1.x-p2.x;
    }
}
public class CollectionsClassMinMaxUser {
    public static void main(String[] args) {
        {
            List<Point> list = new ArrayList<Point>();
            list.add(new Point(5,20));
            list.add(new Point(25,10));
            list.add(new Point(10,40));
            Point p = Collections.max(list,new Comp());
            System.out.println(p.x + " " + p.y);


        }
    }
}
