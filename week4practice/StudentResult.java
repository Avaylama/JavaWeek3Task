import java.util.Scanner;

public class StudentResult {

    static void calculateResult(int m1, int m2, int m3, int m4) {
        int total = m1 + m2 + m3 + m4;
        double percentage = total / 4.0;

        String result = (percentage >= 70) ? "First Class" :
                        (percentage > 59) ? "Upper Second Class" :
                        (percentage > 49) ? "Second Class" :
                        (percentage > 39) ? "Third Class" :
                        "Fail";

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        int s4 = sc.nextInt();

        calculateResult(s1, s2, s3, s4);
    }
}
