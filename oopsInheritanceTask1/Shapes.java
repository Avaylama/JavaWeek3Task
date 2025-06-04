class Shape{
    protected int length;
    protected int breadth;
    protected double radius;

    public Shape(int length, int breadth, double radius){
        this.length = length;
        this.breadth = breadth;
        this.radius = radius;
    }


}

class Rectangle extends Shape{
    public Rectangle(int length, int breadth){
        super(length, breadth, 0);
    }

    public void calculatePerimeter(){
        int perimeter;
        perimeter = 2 * (length + breadth);
        System.out.println(perimeter);
    }

}

class Circle extends Shape{
    public Circle(double radius){
        super(0, 0, radius);
    }
    

    public void calculateCircumference(){

        double circum;

        circum = 2 * Math.PI * radius;
        System.out.println(circum);
    }

    public void calculateArea(){
        double area;
        area = Math.PI * radius * radius;
        System.out.println(area);
    }
}

public class Shapes{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(67, 67);

        rec1.calculatePerimeter();

        Circle cir1 = new Circle(32);

        cir1.calculateArea();

        cir1.calculateCircumference();
    }
}