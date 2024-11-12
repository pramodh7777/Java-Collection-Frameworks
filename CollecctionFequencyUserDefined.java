import java.util.*; 
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (o == this)
            return true;
        if (!(o instanceof Point))
            return false;
        Point p = (Point)o;
        return p.x == x && p.y == y;
    }
}

class GFG { 
    public static void main(String[] argv) 
    {
        
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(10, 20));
        list.add(new Point(5, 25));
        list.add(new Point(10, 20));
        
        Point p = new Point(10, 20);
        
        int freq = Collections.frequency(list, p);
        System.out.println(freq); 
    } 
} 
// @Override
// public boolean equals(Object obj) {
//     if (this == obj) return true;          // Check if both references point to the same object.
//     if (!(obj instanceof gfg)) return false; // Check if obj is not null and is of type gfg.
//     gfg g = (gfg) obj;                      // Safe to cast obj to gfg at this point.
//     return g.x == this.x && g.y == this.y;  // Compare x and y fields for equality.
// }
//////////////////////////////
/// 
// static class Comptr implements Comparator<gfg> {
//     public int compare(gfg p1, gfg p2) {
//         return p1.x - p2.x;
//     }