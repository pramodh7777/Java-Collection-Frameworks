import java.util.*;
class point 
{
    int i,j;
    point(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
    public String toString() {
        return "(" + i + ", " + j + ")";
    }
}


    class MyCamp implements Comparator<point>
    {
       public int compare(point p1, point p2)
        {
            return p1.i-p2.i;
        }
    }

public class comparator1 {
    public static void main(String[] args) {
        point arr[] = {
            new point(10, 25),
            new point(5, 45),
            new point(15, 35),
        };
            // Arrays.sort(arr, new MyCmp());
            Arrays.sort(arr, new MyCamp());
            System.out.println(Arrays.toString(arr));
            // Arrays.sort(arr,(p1,p2)->p1.i-p2.i);

        
    }
}
