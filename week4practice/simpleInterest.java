
import java.util.Scanner;

public class simpleInterest {
    static void si(float p, float t, float r){
        float simpInterest = (p * t * r)/100;
        System.out.println("The simple interest is " + simpInterest);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Principle Amount : ");
        float p = sc.nextFloat();
        System.out.println("Enter Time : ");
        float t = sc.nextFloat();
        System.out.println("Enter Rate : ");
        float r = sc.nextFloat();

        si(p,t,r);
    }
}
