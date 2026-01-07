public class Student {

    private String studentId;
    private String name;
    private String phone;
    private String email;

    public static int totalStudent = 0;

    public Student() {
        totalStudent++;
    }

    public Student(String studentId, String name, String email, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        totalStudent++;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void showInfo(){
        System.out.println("=== Student Information ===");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("Phone      : " + phone);
    }
}
