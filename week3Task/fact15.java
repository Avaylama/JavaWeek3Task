import java.util.Scanner;

public class fact15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        float factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }
}
