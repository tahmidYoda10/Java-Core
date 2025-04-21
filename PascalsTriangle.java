import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int num = 1;

            // Print leading spaces for alignment
            System.out.printf("%" + (rows - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
