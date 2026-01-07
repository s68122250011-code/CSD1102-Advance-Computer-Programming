public class FitnessClass {


    private String className;
    private String trainer;

    public static int totalFitnessClass = 0;

    
    public FitnessClass() {
        totalFitnessClass++;
    }

  
    public FitnessClass(String className, String trainer) {
        this.className = className;
        this.trainer = trainer;
        totalFitnessClass++;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void showClass() {
        System.out.println("=== Fitness Class Information ===");
        System.out.println("Class Name : " + className);
        System.out.println("Trainer    : " + trainer);
    }
}
