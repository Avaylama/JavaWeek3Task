import java.util.Scanner;

public class ternaryVote {
    static void voteCast(int age){
        String a = (age <= 18) ? age + " " + "is not valid for voting." : age + " " + "is valid.";
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the age : " + " ");
        int age = sc.nextInt();

        voteCast(age);
    }
}
