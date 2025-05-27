import java.util.Scanner;

public class Que17 {

    // Find intersection of two sorted arrays

    public static void main(String[] args) {
        System.out.print("size of array1 : ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("array elements : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("size of array2 : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("elements of array2 :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();

        // intersection of two arrays
        System.out.print("Intersection of two sorted arrays: ");
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                // To avoid duplicates
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    System.out.print(arr1[i] + " ");
                }
                i++;
                j++;
            }
        }
        System.out.println();

    }
}
