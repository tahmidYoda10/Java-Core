import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        
        for (int i = 0; i < n; i++) {
            System.out.println("Hiiiiii");
        }

        sc.close();
    }    
}
