public class Circled{
    private double radius;
    // private float pi = 3.14f;

    public void setRadius(double radius){
        if (radius > 0){
            this.radius = radius;

        }else {
            System.out.println("Invalid radius must be greater than 0.");
        }
    }

    public double getRadius(){
        return radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public double calculateCircum(){
        return 2 *  Math.PI * radius;
    }

    public static void main(String[] args){
        Circled Circ = new Circled();

        Circ.setRadius(25.0);

        System.out.println("Radius : " + Circ.getRadius());
        System.out.println("Area : " + Circ.calculateArea());
        System.out.println("Circumstances :" + Circ.calculateCircum());
    }

}