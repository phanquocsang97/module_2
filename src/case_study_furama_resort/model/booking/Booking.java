package case_study_furama_resort.model.booking;

public class Booking {
    private String idBooking;
    private String dateBooking;
    private String dateBeginBooking;
    private String dateEndBooking;
    private String idCustomerBooking;
    private String idServiceBooking;

    public Booking() {
    }

    public Booking(String idBooking, String dateBooking, String dateBeginBooking, String dateEndBooking, String idCustomerBooking, String idServiceBooking) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.dateBeginBooking = dateBeginBooking;
        this.dateEndBooking = dateEndBooking;
        this.idCustomerBooking = idCustomerBooking;
        this.idServiceBooking = idServiceBooking;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDateBeginBooking() {
        return dateBeginBooking;
    }

    public void setDateBeginBooking(String dateBeginBooking) {
        this.dateBeginBooking = dateBeginBooking;
    }

    public String getDateEndBooking() {
        return dateEndBooking;
    }

    public void setDateEndBooking(String dateEndBooking) {
        this.dateEndBooking = dateEndBooking;
    }

    public String getIdCustomerBooking() {
        return idCustomerBooking;
    }

    public void setIdCustomerBooking(String idCustomerBooking) {
        this.idCustomerBooking = idCustomerBooking;
    }

    public String getIdServiceBooking() {
        return idServiceBooking;
    }

    public void setIdServiceBooking(String idServiceBooking) {
        this.idServiceBooking = idServiceBooking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dateBeginBooking='" + dateBeginBooking + '\'' +
                ", dateEndBooking='" + dateEndBooking + '\'' +
                ", idCustomerBooking='" + idCustomerBooking + '\'' +
                ", idServiceBooking='" + idServiceBooking + '\'' +
                '}';
    }
}
