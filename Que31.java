import java.util.*;

public class Que31 {
    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                String str = Integer.toString(count);
                for (char ch : str.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}

public static void main(String[] args) {
    System.out.println("Enter characters :");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] chars = s.toCharArray();
    int newLength = compress(chars);
    System.out.print("Compressed: ");
    for (int i = 0; i < newLength; i++) {
        System.out.print(chars[i]);
    }
    System.out.println("\nLength: " + newLength);
}