public class Reservation {

    
    private String reservationId;
    private String date;
    private String type;


    public static int totalReservations = 0;

   
    public Reservation(String reservationId, String date, String type) {
        this.reservationId = reservationId;
        this.date = date;
        this.type = type;
        totalReservations++;
    }

    
    public Reservation() {
        this.reservationId = "N/A";
        this.date = "N/A";
        this.type = "Unknown";
        totalReservations++;
    }

 
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void createReservation() {
        System.out.println("Reservation created: " + reservationId);
    }

    public void cancelReservation() {
        System.out.println("Reservation cancelled: " + reservationId);
    }
}
