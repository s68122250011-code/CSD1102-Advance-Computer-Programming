public class Equipment {


   private String equipmentName;
   private String status;
   private int id;




   public static String department = "Sports Center";
   public static int equipmentCount = 0;




   public Equipment(String equipmentName) {
       this.equipmentName = equipmentName;
       this.status = "Available";
       equipmentCount++;
       this.id = equipmentCount;
   }




   public Equipment(String equipmentName, String status) {
       this.equipmentName = equipmentName;
       this.status = status;
       equipmentCount++;
       this.id = equipmentCount;
   }




   public String getEquipmentName() { return equipmentName; }
   public void setEquipmentName(String equipmentName) { this.equipmentName = equipmentName; }


   public String getStatus() { return status; }
   public void setStatus(String status) { this.status = status; }


   public int getId() { return id; }
   public void setId(int id) { this.id = id; }




   public void showStatus() {
       System.out.println("ID: " + id + " | Item: " + equipmentName + " | Status: " + status + " | Dept: " + department);
   }
}