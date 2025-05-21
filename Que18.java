import java.util.Scanner;

public class Que18 {

    // Trapping Rain Water

    public static void main(String[] args) {
        System.out.print("array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] elevation = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < elevation.length; i++) {
            elevation[i] = sc.nextInt();
        }
        sc.close();

        // Two pointers
        int left = 0, right = elevation.length - 1;
        int maxFromLeft = 0, maxFromRight = 0; // Track maximum height from both sides
        int trappedWater = 0;

        while (left < right) {
            if (elevation[left] < elevation[right]) {
                // Update max from left or calculate trapped water
                if (elevation[left] > maxFromLeft) {
                    maxFromLeft = elevation[left];
                } else {
                    trappedWater += maxFromLeft - elevation[left];
                }
                left++;
            } else {
                // Update max from right or calculate trapped water
                if (elevation[right] >= maxFromRight) {
                    maxFromRight = elevation[right];
                } else {
                    trappedWater += maxFromRight - elevation[right];
                }
                right--;
            }
        }
        System.out.println("Trapped rain water : " + trappedWater);
    }
}
