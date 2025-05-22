import java.util.Scanner;

public class Que12 {

    // Count the number of occurrences of an element

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("element, whose occurance is to be counted : ");
        int element = sc.nextInt();
        sc.close();

        // counts the occurance of an element in the array
        int count = 0;

        for(int i=0; i<size; i++){
            if(arr[i] == element){
                count++;
            }
        }

        System.out.println("The element " + element + " occurs " + count + " times in the array.\n");
    }
}