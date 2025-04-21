import java.util.Scanner;

public class marks9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        int totalSubjects = 5;
        int totalMarks = 0;

        System.out.println("Enter marks for 5 subjects (out of 100):");

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }

        
        float percentage = (float) totalMarks / (totalSubjects * 100) * 100;

        
        System.out.println("\nTotal Marks: " + totalMarks + " / " + (totalSubjects * 100));
        System.out.println("Percentage: " + percentage + "%");

        
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        
    }
}
