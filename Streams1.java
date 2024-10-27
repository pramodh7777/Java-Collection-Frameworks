import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

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
    public String toString() {
        return "Student{" +
               "roll=" + roll +
               ", name='" + Name + '\'' +
               ", marks=" + marks +
               '}';
    }
}
class Streams1{
    public static void main(String[] args) {
        Student arr[] = {new Student(12, "gfg", 70),
                     new Student(23, "ide", 60),
                    new Student(24, "fgh", 50)};
        Map<Integer,String> m  = Arrays.stream(arr)
                     .collect(Collectors.toMap(Student::getRoll,Student::getName));
                     //Equivalent Lambda: (Student s) -> s.getRoll()
                     System.out.println(m);

        Map<Integer,List<Student>> m1 = Arrays.stream(arr).collect(Collectors.groupingBy(Student::getMarks));
        System.out.println(m1);
                     
    
    }
}