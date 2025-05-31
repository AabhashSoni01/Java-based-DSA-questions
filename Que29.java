import java.util.Scanner;

public class Que29 {
    // Implement strstr() (substring search)
    public static void substringSearch(String str, String subStr) {
        if (subStr.isEmpty()) {
            System.out.println("substring is empty !");
            return;
        }

        int strLength = str.length();
        int subStrLength = subStr.length();

        for (int i = 0; i <= strLength - subStrLength; i++) {
            int j = 0;
            while (j < subStrLength && str.charAt(i + j) == subStr.charAt(j)) {
                j++;
            }
            if (j == subStrLength) {
                int start = i;
                int end = i + subStrLength - 1;
                System.out.println("Substring found; starts at index: " + start + ", ends at index: " + end);
                return;
            }
        }
        System.out.println("Substring not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string : ");
        String str = sc.nextLine();
        System.out.print("Enter the substring : ");
        String subStr = sc.nextLine();
        sc.close();
        substringSearch(str, subStr);
    }
}
