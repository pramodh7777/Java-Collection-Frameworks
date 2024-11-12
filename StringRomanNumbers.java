import java.util.*;

public class StringRomanNumbers {
    static int converted(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('M', 1000);
        m.put('D', 500);
        m.put('C', 100);
        m.put('L', 50);
        m.put('X', 10);
        m.put('V', 5);
        m.put('I', 1);

        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = m.get(s.charAt(i));
            int next = m.get(s.charAt(i + 1));
            System.out.println("Current: " + current + ", Next: " + next);
            if (current < next) {
                ans += next - current; // Handle the subtraction case (e.g., IV, IX)
                i++; // Skip the next character, which is already processed in subtraction
            } else {
                ans += current; // Otherwise, just add the current value
            }
            System.out.println("Intermediate answer: " + ans);
        }

        // Add the value of the last character that isn't handled in the loop
        // The last character is handled after the loop, but we need to add it only once
        if (s.length() > 1 && m.get(s.charAt(s.length() - 2)) >= m.get(s.charAt(s.length() - 1))) {
            ans += m.get(s.charAt(s.length() - 1));
        }
        System.out.println("Final answer (after last character): " + ans);

        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMIV";  // Roman numeral for 1904
        int x = converted(s);
        System.out.println("Final Output: " + x); // Output should be 1904
    }
}
