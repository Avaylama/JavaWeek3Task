import java.util.Scanner;

public class natural13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        sc.close();

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
