import java.util.Scanner;

public class numReverse22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reversedNum = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;          
            reversedNum = reversedNum * 10 + digit;  
        }

        sc.close();

        System.out.println("Reversed number: " + reversedNum);

        
    }
}
