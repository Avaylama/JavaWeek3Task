interface Employee {
    void work();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("Chef is preparing meals and managing the kitchen.");
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("Waiter is taking orders and serving food to customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        System.out.println("=== Employee Responsibilities ===");
        chef.work();
        waiter.work();
    }
}
