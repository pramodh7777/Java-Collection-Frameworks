import java.util.*;
class Student1{
    int roll,marks;
    Student1(int r, int m)
    {
        roll=r;
        marks = m;
    }
}

class cmp1 implements Comparator<Student1>
{
    public int compare(Student1 s1, Student1 s2)
    {
        return s2.marks-s1.marks;
    }

}
public class ArraysSortStudentsByMarks {
    static void SortAccordingToMarks(int a[], int b[])
    {
        int n = a.length;
        List<Student1> al = new ArrayList<>(n);
        for(int i =0;i<n;i++)
        {
            al.add(new Student1(a[i], b[i]));

        }
        Collections.sort(al, new cmp1());
        for(Student1 x: al)
        {
            System.out.println(x.roll+" "+x.marks);
        }
    }
    public static void main(String[] args) {
        
        int a[]  = {101,108,103,105};
        int b[] = {70,80,40,90};
        SortAccordingToMarks(a,b);
    }
}
