public class Student {

    private String name;
    private String idNumber;
    private double gpa;

    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA. Must be between 0.0 and 4.0. Setting to 0.0.");
            this.gpa = 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        
        Student student1 = new Student("Avay Theeng", "240522", 3.8);
        
        System.out.println("First Student Information : ");
        student1.printStudentInfo();

        student1.setName("Avay Lama");
        student1.setIdNumber("240521");

        System.out.println("Updated Student Information : ");
        student1.printStudentInfo();
    }
}

