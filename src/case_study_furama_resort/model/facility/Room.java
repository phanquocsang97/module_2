package case_study_furama_resort.model.facility;

public class  Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idService, String nameService, String areaService, String costService, String peopleService, String kindOfRentService, String freeService) {
        super(idService, nameService, areaService, costService, peopleService, kindOfRentService);
        this.freeService = freeService;
    }

    public Room(String idRoom, String nameRoom, String areaRoom, String costRoom, String peopleRoom, String rentalTypeRoom, String kindOfRoom, String floorRoom) {
    }

    @Override
    public String toString() {
        return "Room{" +
                "idHouse='" + idService + '\'' +
                ", nameHouse='" + nameService + '\'' +
                ", areaHouse='" + areaService + '\'' +
                ", costHouse='" + costService + '\'' +
                ", peopleHouse='" + peopleService + '\'' +
                ", kindOfRentHouse='" + kindOfRentService + '\'' +
                ", freeHouse='" + freeService + '\'' +
                '}';
    }


}
