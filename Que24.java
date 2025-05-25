import java.util.Scanner;

public class Que24 {
    // Print all permutations of a string
    static void permute(String str, int l, int r) {
        if (l == r) {
            // one combination is ready
            System.out.println(str);
            return;
        }

        for (int i = l; i <= r; i++) {
            str = swap(str, l, i); // fix one character
            permute(str, l + 1, r); // permute the rest
            str = swap(str, l, i); // backtrack to original
        }
    }

    static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("All permutation of the string : ");
        permute(str, 0, str.length() - 1);
    }
}
