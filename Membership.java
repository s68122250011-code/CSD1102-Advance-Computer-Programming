public class Membership {

    private String membershipId;
    private Student student;
    private String membershipType;
    private String status;   

    public Membership(String membershipId, Student student, String membershipType) {
        this.membershipId = membershipId;
        this.student = student;
        this.membershipType = membershipType;
        this.status = "Active";
    }

    public boolean isActive() {
        return status.equalsIgnoreCase("Active");
    }

    public boolean checkIn() {
        if (isActive()) {
            System.out.println("Check-in successful");
            return true;
        } else {
            System.out.println("Check-in denied : Membership not active");
            return false;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void showMembershipInfo() {
        System.out.println("=== Membership Information ===");
        System.out.println("Membership ID : " + membershipId);
        System.out.println("Student ID    : " + student.getStudentId());
        System.out.println("Name          : " + student.getName());
        System.out.println("Type          : " + membershipType);
        System.out.println("Status        : " + status);
    }
}
