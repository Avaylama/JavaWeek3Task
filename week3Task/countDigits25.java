import java.util.Scanner;

public class countDigits25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;  
                count++;    
            }
        }
        sc.close();
        System.out.println("The number of digits is: " + count);
    }
}
