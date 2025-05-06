import java.util.Scanner;

public class MultiCalculation {

    static void squareCalculations(double side) {
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Square Area: " + area);
        System.out.println("Square Perimeter: " + perimeter);
    }

    static void simpleInterest(double principal, double rate, double time) {
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
    }

    static void triangleArea(double base, double height) {
        double area = (base * height) / 2;
        System.out.println("Area of Triangle: " + area);
    }

    static void cubeVolume(double side) {
        double volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    static void cuboidVolume(double length, double breadth, double height) {
        double volume = length * breadth * height;
        System.out.println("Volume of Cuboid: " + volume);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double squareSide = sc.nextDouble();
        squareCalculations(squareSide);

        // Simple Interest
        System.out.print("\nEnter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();
        simpleInterest(principal, rate, time);

        // Triangle
        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        triangleArea(base, height);

        // Cube
        System.out.print("\nEnter side of cube: ");
        double cubeSide = sc.nextDouble();
        cubeVolume(cubeSide);

        // Cuboid
        System.out.print("\nEnter length of cuboid: ");
        double cuboidLength = sc.nextDouble();
        System.out.print("Enter breadth of cuboid: ");
        double cuboidBreadth = sc.nextDouble();
        System.out.print("Enter height of cuboid: ");
        double cuboidHeight = sc.nextDouble();
        cuboidVolume(cuboidLength, cuboidBreadth, cuboidHeight);
    }
}
