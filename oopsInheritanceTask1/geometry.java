class Shape{
    protected int length;
    protected int breadth;
    protected double radius;

    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public Shape(double radius){
        this.radius = radius;
    }

}

class Rectangle extends Shape{
    public Rectangle(int length, int breadth){
        super(length, breadth);
    }
    public void calculateRectangle(){
        int rect;
        rect = length * breadth;
        System.out.println(rect);
    }

}

class Circle extends Shape{
    public Circle(double radius){
        super(radius);
    }
    public void calculateArea(){
        double area;
        area = Math.PI * radius * radius;
        System.out.println(area);
    }
}

public class geometry{
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(67, 67);

        rec1.calculateRectangle();

        Circle cir1 = new Circle(32);

        cir1.calculateArea();
    }
}