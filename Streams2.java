
import java.util.Arrays;
import java.util.stream.Stream; 
public class Streams2 {
    public static void main(String[] args) {
        Stream.iterate(1,x->x+1)
              .filter(x->x.toString().contains("5"))
              .limit(10)
              .forEach(System.out::println);

     String arr[] = {"abc", "cde", "acd", "acc",};
     Arrays.stream(arr)
           .filter(x->x.startsWith("a"))
           .filter(x->x.endsWith("c"))
           .sorted()
           .forEach(System.out::println);

    }
}
