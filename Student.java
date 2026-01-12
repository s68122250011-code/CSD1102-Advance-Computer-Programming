public class Student {
    private String studentId;
    private String name;
    private String major;
    private double gpa;

    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("---------------------");
    }
}

