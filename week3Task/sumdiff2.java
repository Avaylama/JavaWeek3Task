
import java.util.Scanner;

public class sumdiff2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.println("Enter first number :");
        int num1 = sc.nextInt();

        System.out.println("Enter second number :");
        int num2 = sc.nextInt();
        
       

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + product);
        
        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Quotitent : " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        

        
    }
}
