import java.util.Arrays;
import java.util.Scanner;

public class merge_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);

        // Sort the merged array
        Arrays.sort(merged);

        // Print merged array
        System.out.println("Merged and sorted array: " + Arrays.toString(merged));

        sc.close(); 
    } 
}
