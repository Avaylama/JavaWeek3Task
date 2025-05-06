import java.util.Scanner;

public class StudentInfo {

    static void displayInfo(String name, String rollNo, String interest) {
        System.out.println("\nHey, my name is " + name + " and my roll number is " + rollNo + 
                           ". My field of interest are " + interest + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNo = sc.nextLine();

        System.out.print("Enter your field of interest: ");
        String interest = sc.nextLine();

        displayInfo(name, rollNo, interest);
    }
}
