import java.util.Scanner;

public class Que23 {

    // Remove duplicates from a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("original string : ");
        String str = sc.nextLine();
        sc.close();

        boolean[] present = new boolean[256]; // for ASCII
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!present[c]) {
                present[c] = true;
                result.append(c);
            }
        }
        System.out.print("string with duplicates removed : " + result);
    }
}
