package case_study_furama_resort.model.booking;

public class Constract {
    private String idConstract;
    private String idBookingConstract;
    private String depositConstract;
    private String totalConstract;

    public Constract() {
    }

    public Constract(String idConstract, String idBookingConstract, String depositConstract, String totalConstract) {
        this.idConstract = idConstract;
        this.idBookingConstract = idBookingConstract;
        this.depositConstract = depositConstract;
        this.totalConstract = totalConstract;
    }

    public String getIdConstract() {
        return idConstract;
    }

    public void setIdConstract(String idConstract) {
        this.idConstract = idConstract;
    }

    public String getIdBookingConstract() {
        return idBookingConstract;
    }

    public void setIdBookingConstract(String idBookingConstract) {
        this.idBookingConstract = idBookingConstract;
    }

    public String getDepositConstract() {
        return depositConstract;
    }

    public void setDepositConstract(String depositConstract) {
        this.depositConstract = depositConstract;
    }

    public String getTotalConstract() {
        return totalConstract;
    }

    public void setTotalConstract(String totalConstract) {
        this.totalConstract = totalConstract;
    }

    @Override
    public String toString() {
        return "Constract{" +
                "idConstract='" + idConstract + '\'' +
                ", idBookingConstract='" + idBookingConstract + '\'' +
                ", depositConstract=" + depositConstract +
                ", totalConstract=" + totalConstract +
                '}';
    }
}
