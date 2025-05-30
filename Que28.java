import java.util.*;

public class Que28 {
    // Convert string to integer (like atoi)
    public static int atoi(String str) {
        int i = 0, result = 0, sign = 1;
        // Skipping leading whitespaces
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }

        // Checking for + or -
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // Convert digits and handle overflow
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println("String converted into digit : " + atoi(str));
    }
}
