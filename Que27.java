import java.util.Scanner;

public class Que27 {
    // Longest common prefix
    public static String commonPrefix(String[] strs) {

        String prefix = strs[0]; // Start with the first string as the prefix

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of strings : ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[no];

        System.out.println("Enter strings : ");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.nextLine();
        }
        sc.close();
        System.out.println("Longest common prefix is : " + commonPrefix(strs));
    }
}
