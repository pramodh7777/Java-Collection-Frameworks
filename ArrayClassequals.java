import java.util.*;
public class ArrayClassequals {
    public static void main(String[] args) {
        String a[] = {"GFG","IDE"};
        String b[] = {"Gfg","Ide"};

    
    if(Arrays.equals(a,b,String::compareToIgnoreCase))
    
                        
    {
        System.out.println("Yes");

    }
    else
    {
        System.out.println("No");
    }

}

}
/////////////// for older versons
// import java.util.*;

// public class ArrayClassequals {
//     public static void main(String[] args) {
//         String a[] = {"GFG", "IDE"};
//         String b[] = {"Gfg", "Ide"};

//         boolean areEqual = true;

//         if (a.length == b.length) {
//             for (int i = 0; i < a.length; i++) {
//                 if (a[i].compareToIgnoreCase(b[i]) != 0) {
//                     areEqual = false;
//                     break;
//                 }
//             }
//         } else {
//             areEqual = false;
//         }

//         if (areEqual) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }
