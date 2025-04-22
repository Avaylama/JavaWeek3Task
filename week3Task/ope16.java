import java.util.Scanner;

public class ope16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter first number: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter second number: ");
        float num2 = sc.nextFloat();

        
        System.out.println("Enter an operator (+, -, *, /): ");
        String operator = sc.next();  

        float result;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid operator.");
        }
        sc.close();
    }
}
