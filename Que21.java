import java.util.Scanner;

public class Que21 {

    // Reverse a string

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string : ");
        String str = sc.nextLine();
        sc.close();

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.print("reversed string : " + reversed);
    }
}
