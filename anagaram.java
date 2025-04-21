import java.util.Scanner;
import java.util.Arrays;

public class anagaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");

        String s1 = sc.nextLine();

        System.out.print("Enter string 2 : ");
        String s2 = sc.nextLine();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
        sc.close();
    }
}
