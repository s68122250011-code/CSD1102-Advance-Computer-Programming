public class Trainer {
    private String coachName;
    private int number;
    public Trainer() {
        this.coachName = "";
        this.number = 0;
    }
    public Trainer(String coachName, int number) {
        this.coachName = coachName;
        this.number = number;
    }
    public String getCoachName() {
        return coachName;
    }
    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void showTrainer() {
        System.out.println("=== Trainer Information ===");
        System.out.println("Trainer: " + coachName);
        System.out.println("Number: " + number);
    }
}
