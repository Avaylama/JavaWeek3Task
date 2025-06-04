class Vehicle{
    public void startEngine(){
        System.out.println("Vehicle startEngine");
    }
    public void stopEngine(){
        System.out.println("Vehicle stopEngine");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("Car Drive");
    }
}

class Motorcycle extends Vehicle{
    public void ride(){
        System.out.println("Motorcycle ride");
    }
}


public class Hierarchy{
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.drive();
        car1.startEngine();
        car1.stopEngine();

        Motorcycle motor1 = new Motorcycle();

        motor1.ride();
        motor1.startEngine();
        motor1.stopEngine();
    }
}