import java.util.Arrays;

class Student{
    int roll;
    String Name;
    int marks;
    Student(int r,String n,int m)
    {
        roll = r;
        Name = n;
        marks = m;

    }
    int getRoll()
        {
         return roll;
        }
    String getName(){
        return Name;
    }
    int getMarks(){
        return marks;
    }
}
class Streams{
    public static void main(String[] args) {
        Student arr[] = {new Student(12, "gfg", 70),
                     new Student(23, "ide", 60),
                    new Student(24, "fgh", 50)};
        double res = Arrays.stream(arr)
                     .mapToInt(x->x.getMarks())
                     .average()
                     .getAsDouble();
                     System.out.println(res);      
        
    }
}