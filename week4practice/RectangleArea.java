import java.util.Scanner;

public class RectangleArea {

    static void calculateArea(double length, double breadth) {
        double area = length * breadth;
        int intArea = (int) area;
        System.out.println("Area of the rectangle (int): " + intArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        calculateArea(length, breadth);
    }
}
