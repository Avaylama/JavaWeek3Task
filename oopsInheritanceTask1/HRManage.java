class Employee{
    public void work(){
        System.out.println("Employee work");
    }
    public void getSalary(){
        System.out.println("Employee salary");
    }
}

class HRManager extends Employee{

    public void work(){
        System.out.println("HRManager work");
    }
}

public class HRManage{
    public static void main(String[] args) {
        HRManager hr1 = new HRManager();

        hr1.work();
        hr1.getSalary();
    }
}