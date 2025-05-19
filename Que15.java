import java.util.Scanner;

public class Que15 {

    // Missing number in array [1 to n]
    public static void main(String[] args) {
        System.out.print("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // size = n - 1
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int n = size + 1; // since one number is missing
        int total = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missingNum = total - arrSum;

        System.out.println("The missing number is : " + missingNum);
    }
}
