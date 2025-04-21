import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        if (n < 2) {
            System.out.println("Need at least 2 elements to find second largest.");
            return;
        }

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest Element: " + max + " at index " + maxIndex);
        System.out.println("Second Largest Element: " + (secondMax == Integer.MIN_VALUE ? "Not found" : secondMax));

        sc.close();
    }
}
