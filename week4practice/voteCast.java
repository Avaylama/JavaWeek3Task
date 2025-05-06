
import java.util.Scanner;

public class voteCast {
    static void voting(int age){

        if (age <= 18){
            System.out.println(age + " " + "is not valid for casting vote.");
        } else{
            System.out.println(age + " " + "is valid for casting vote.");
        }

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age : ");
        int age = sc.nextInt();

        voting(age);

    }
}
