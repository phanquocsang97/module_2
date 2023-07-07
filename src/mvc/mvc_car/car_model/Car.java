package mvc.mvc_car.car_model;

public class Car {
    private int idCar;
    private String nameCar;
    private int priceCar;
    private int xyLanhCar;
    private double taxCar;

    public Car() {
    }

    public Car(int idCar, String nameCar, int priceCar, int xyLanhCar) {
        this.idCar = idCar;
        this.nameCar = nameCar;
        this.priceCar = priceCar;
        this.xyLanhCar = xyLanhCar;
        if (xyLanhCar < 100){
            this.taxCar = 0.01 * this.priceCar;
        } else if (xyLanhCar < 200) {
            this.taxCar = 0.03 * this.priceCar;
        } else {
            this.taxCar = 0.05 * this.priceCar;
        }
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(int priceCar) {
        this.priceCar = priceCar;
    }

    public int getXyLanhCar() {
        return xyLanhCar;
    }

    public void setXyLanhCar(int xyLanhCar) {
        this.xyLanhCar = xyLanhCar;
    }

    public double getTaxCar() {
        return taxCar;
    }

    public void setTaxCar(double taxCar) {
        this.taxCar = taxCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", nameCar='" + nameCar + '\'' +
                ", priceCar=" + priceCar +
                ", xyLanhCar=" + xyLanhCar +
                ", taxCar=" + taxCar +
                '}';
    }
    public String converToString(){
        return idCar + "," + nameCar + "," + priceCar + "," + xyLanhCar + "," + taxCar;
    }
}
