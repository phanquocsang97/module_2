package case_study_furama_resort.model.facility;

public class Villa extends Facility{
    private String kindOfRoom;
    private String areaPool;
    private String floor;

    public Villa() {
    }

    public Villa(String kindOfRoom, String areaPool, String floor) {
        this.kindOfRoom = kindOfRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String idService, String nameService, String areaService, String costService, String peopleService, String kindOfRentService, String kindOfRoom, String areaPool, String floor) {
        super(idService, nameService, areaService, costService, peopleService, kindOfRentService);
        this.kindOfRoom = kindOfRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "idVilla='" + idService + '\'' +
                ", nameVilla='" + nameService + '\'' +
                ", areaVilla=" + areaService +
                ", costHouse='" + costService + '\'' +
                ", peopleVilla='" + peopleService + '\'' +
                ", kindOfRentVilla='" + kindOfRentService + '\'' +
                ", kindOfVilla=" + kindOfRoom +
                ", areaPoolVilla=" + areaPool +
                ", floorVilla='" + floor + '\'' +
                '}';
    }
}
