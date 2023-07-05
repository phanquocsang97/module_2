package case_study_furama_resort.model.facility;

public class House extends Facility{
    private String kindOfHouse;
    private String floorVilla;

    public House() {
    }


    public House(String kindOfHouse, String floorVilla) {
        this.kindOfHouse = kindOfHouse;
        this.floorVilla = floorVilla;
    }

    public House(String idService, String nameService, String areaService, String costService, String peopleService, String kindOfRentService, String kindOfHouse, String floorVilla) {
        super(idService, nameService, areaService, costService, peopleService, kindOfRentService);
        this.kindOfHouse = kindOfHouse;
        this.floorVilla = floorVilla;
    }

    public String getKindOfHouse() {
        return kindOfHouse;
    }

    public void setKindOfHouse(String kindOfHouse) {
        this.kindOfHouse = kindOfHouse;
    }

    public String getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(String floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return "House{" +
                "idHouse='" + idService + '\'' +
                ", nameHouse='" + nameService + '\'' +
                ", areaHouse='" + areaService + '\'' +
                ", costHouse='" + costService + '\'' +
                ", peopleHouse='" + peopleService + '\'' +
                ", rentalTypeHouse=" + kindOfRentService +
                ", kindOfHouse=" + kindOfHouse +
                ", floorHouse='" + floorVilla + '\'' +
                '}';
    }
}
