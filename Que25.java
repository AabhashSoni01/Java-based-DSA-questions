import java.util.Scanner;

public class Que25 {
    // Check if two strings are anagrams
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine().toLowerCase().trim();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine().toLowerCase().trim();
        sc.close();

        if (str1.length() != str2.length()) {
            System.out.println("Both string has different lengths; anagram check will not be proceeded !!");
            return;
        }

        int[] arr = new int[26]; // for 'a' to 'z'

        // Increment count for characters in str1 and decrement for characters in str2
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a']++;
            arr[str2.charAt(i) - 'a']--;
        }

        // Check if all counts are zero; if not, strings are not anagrams
        for (int num : arr) {
            if (num != 0) {
                System.out.println("strings are not anagrams !");
                return;
            }
        }
        System.out.println("strings are anagrams !");
    }
}
