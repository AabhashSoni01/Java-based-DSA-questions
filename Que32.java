import java.util.HashSet;
import java.util.Scanner;

public class Que32 {
    // Longest substring without repeating characters
    public static String LongestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int start = 0, maxLength = 0, maxStringStart = 0;

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            while (set.contains(currentChar)) {
                set.remove(str.charAt(start));
                start++;
            }
            set.add(currentChar);

            // Update maxLength and starting index
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStringStart = start;
            }
        }
        return str.substring(maxStringStart, maxStringStart + maxLength);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        sc.close();
        String result = LongestSubstring(str);
        System.err.println("Longest substring without repeating characters: " + result);
        System.out.println("Length: " + result.length());
    }
}
