import java.util.Scanner;

public class Que6 {
    // Find Union and Intersection of two arrays
    public static void main(String[] args) {
        System.out.print("size of array1 : ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("elements of array1 :");
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

        // union of two arrays
        int[] union = new int[arr1.length + arr2.length];
        int unionCount = 0;

        // Add unique elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < unionCount; j++) {
                if (arr1[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[unionCount++] = arr1[i];
            }
        }

        // Add unique elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < unionCount; j++) {
                if (arr2[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[unionCount++] = arr2[i];
            }
        }

        // intersection of two arrays
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int intersecCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean isAlreadyAdded = false;
                    for (int k = 0; k < intersecCount; k++) {
                        if (intersection[k] == arr1[i]) {
                            isAlreadyAdded = true;
                            break;
                        }
                    }
                    if (!isAlreadyAdded) {
                        intersection[intersecCount++] = arr1[i];
                    }
                    break;
                }
            }
        }

        System.out.print("union of array: ");
        for (int i = 0; i < unionCount; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.print("\nintersection of array: ");
        for (int i = 0; i < intersecCount; i++) {
            System.out.print(intersection[i] + " ");
        }
    }
}
