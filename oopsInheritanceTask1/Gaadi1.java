class Vehicle{
    public void drive(){
        System.out.println("Vehicle Drive");
    }
}
class Car extends Vehicle{
    public void display(){
        System.out.println("Car Display");
    }
}

public class Gaadi1{
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.drive();
        car1.display();
        
    }
}

