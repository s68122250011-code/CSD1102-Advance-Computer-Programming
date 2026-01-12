public class TestStudentMain {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student("68122250011", "Cheer", "Computer Science", 3.20);
        students[1] = new Student("68122259999", "Bee", "Information Tech", 3.50);
        students[2] = new Student("68122258888", "Mild", "Software Eng", 2.95);

        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}
