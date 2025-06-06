import java.util.*;

public class Que34 {

    // Check if a string is a rotation of another string

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }
        String s = str1 + str1;
        return s.contains(str2);
    }

    public static void main(String[] args) {
        System.out.print("Enter first string : ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        sc.close();
        System.out.println(isRotation(str1, str2));
    }
}
