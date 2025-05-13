import java.util.Scanner;

public class Que9 {
    // Check if array is sorted and rotated
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Array is fully sorted, not rotated");
        } else if (count <= 1) {
            System.out.println("Array is sorted and rotated");
        } else {
            System.out.println("Array is NOT sorted or rotated");
        }
    }
}
