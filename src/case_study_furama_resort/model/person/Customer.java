package case_study_furama_resort.model.person;

public class Customer extends Person{
    private String idCustomer;
    private String kindOfCustomer;
    private String addressCustomer;

    public Customer() {
    }

    public Customer(String name, String date, boolean gender, String identityNumber, String phoneNumber, String email, String idCustomer, String kindOfCustomer, String addressCustomer) {
        super(name, date, gender, identityNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.kindOfCustomer = kindOfCustomer;
        this.addressCustomer = addressCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer='" + idCustomer + '\'' +
                ", kindOfCustomer='" + kindOfCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", identityNumber=" + identityNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
