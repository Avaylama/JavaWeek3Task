public class Employee{
    
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void applyRaise(double percentage) {
        if (percentage > 0) {
            double increase = salary * (percentage / 100);
            salary += increase;
        } else {
            System.out.println("Invalid! must be greater than 0.");
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: Rs" + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Avay", "Software Developer", 75000);

        System.out.println("First Employee Information :");
        emp.printDetails();

        emp.applyRaise(10);  

        System.out.println("After 10% increase:");
        emp.printDetails();
    }
}
