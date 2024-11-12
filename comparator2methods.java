///  Error in the output , left to check when time

import java.util.*;

class Point {
    String name;
    int rollNum;

    Point(String n, int r) {
        this.name = n;
        this.rollNum = r;
    }

    String getName() {
        return name;
    }

    int getRoll() {
        return rollNum;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + rollNum + ")";
    }
}

public class comparator2methods {
    public static void main(String[] args) {
        Point[] arr = {
            new Point("x", 25),
            new Point("y", 45),
            new Point("z", 35),
        };

        Arrays.sort(arr, Comparator.comparing(Point::getName).thenComparing(Point::getRoll));

        System.out.println(Arrays.toString(arr));
    }
}
