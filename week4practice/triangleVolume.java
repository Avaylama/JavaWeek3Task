
import java.util.Scanner;

public class triangleVolume {
    static void calculateTriangle(int l, int w){

        int areaTriangle = (1/2) * l * w;
        System.out.println("The area of triangle is " + " " + areaTriangle);
        
    }
    static void calculateCube(int l, int w, int h){

        int volumeCube = l * w * h;
        System.out.println("The area of triangle is " + " " + volumeCube);

    }
    static void calculateCuboid(int s){

        int volumeCuboid = s * s * s;
        System.out.println("The area of triangle is " + " " + volumeCuboid);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length :");
        int l = sc.nextInt();
        System.out.println("Enter the width :");
        int w = sc.nextInt();
        System.out.println("Enter the height :");
        int h = sc.nextInt();
        System.out.println("Enter the side :");
        int s = sc.nextInt();

        calculateTriangle(l, w);

        calculateCube(l, w, h);

        calculateCuboid(s);

    }
}
