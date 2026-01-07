public class FitnessApp {

    public static void main(String[] args) {

        // ===== Student =====
        Student student = new Student(
                "S001",
                "A B",
                "AB@example.com",
                "0812345678"
        );
        student.showInfo();
        System.out.println();

        // ===== Membership =====
        Membership membership = new Membership(
                "M001",
                student,
                "Student"
        );
        membership.showMembershipInfo();
        membership.checkIn();
        System.out.println();

        // ===== Trainer  =====
        Trainer trainer = new Trainer("Coach Mike", 101);
        trainer.showTrainer();
        System.out.println();

        // ===== Fitness Class  =====
        FitnessClass fitnessClass = new FitnessClass(
                "Yoga Class",
                trainer.getCoachName()   
        );

        fitnessClass.showClass();
        System.out.println("Total Class: " + FitnessClass.totalFitnessClass);
        System.out.println();

        // ===== Reservation =====
        Reservation reservation = new Reservation(
                "R001",
                "2024-07-15",
                "Fitness Class"
        );
        reservation.createReservation();
        reservation.cancelReservation();
        System.out.println();

        // ===== Equipment =====
        Equipment equipment = new Equipment("Treadmill", "Available");
        equipment.showStatus();
    }
}
