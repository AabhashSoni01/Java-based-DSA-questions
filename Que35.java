import java.util.Scanner;

public class Que35 {
    
    // Check if one string is a subsequence of another

    public static void main(String[] args) {
        System.out.print("Enter first string : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        sc.close();

        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }
            j++;
        }

        if (i == str1.length()) {
            System.out.println("First string is a subsequence of Second string !");
        } else {
            System.out.println("First string is not a subsequence of Second string !");
        }
    }
}
