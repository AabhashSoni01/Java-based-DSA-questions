import java.util.Scanner;

public class Que22 {

    // Check for palindrome

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        sc.close();

        boolean isPalindrome = true;
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("string is a palindrome\n");
        } else {
            System.out.println("string is not a palindrome\n");
        }
    }
}
