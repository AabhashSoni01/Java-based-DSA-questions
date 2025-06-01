import java.util.Scanner;

public class Que30 {
    // Valid Palindrome after removing at most one character
    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(checkPalindrome(str));
    }
}
