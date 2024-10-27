import java.util.*;
public class balancingparanthesis {
   static boolean balancingparanthesis1(String str)
    {
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<str.length();i++)
        {
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='[')
            {
                stack.push(x);
            }
            else{
            if(stack.isEmpty())
            return false;
            else if(isMatching(stack.peek(),x)==false)
            return false;
            else{
                stack.pop();
            }
        }
            

        }
        return stack.isEmpty();
    }
    static boolean isMatching(Character a, Character b)
    {
        return (a=='(' && b==')' || a=='{' && b=='}' ||a=='[' && b==']');
        
    }
    public static void main(String[] args) {
        String s="{[()]}";

      System.out.println(balancingparanthesis1(s));

    }
}
