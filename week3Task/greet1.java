
import java.util.Scanner;

public class greet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        System.out.println("Enter a name :");
        String name = sc.nextLine();

        System.out.println("Namaste" + name);
        sc.close();
    }
}

