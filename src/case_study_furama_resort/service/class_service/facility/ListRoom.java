package case_study_furama_resort.service.class_service.facility;

import case_study_furama_resort.common.validate.Validate;
import case_study_furama_resort.model.facility.Facility;
import case_study_furama_resort.model.facility.Room;

public class ListRoom {
    public static Facility addRoom(){
        String idRoom = Validate.validateIdFacility();
        String nameRoom = Validate.validateNameAndTypeFacility();
        String areaRoom = Validate.validateAreaAndPoolFacility();
        String costRoom = Validate.validateCostAndFloorFacility();
        String peopleRoom = Validate.validatePeopleFacility();
        String rentalTypeRoom = Validate.validateNameAndTypeFacility();
        String kindOfRoom = Validate.validateNameAndTypeFacility();
        String floorRoom = Validate.validateCostAndFloorFacility();
        return new Room(idRoom,nameRoom,areaRoom,costRoom,peopleRoom,rentalTypeRoom,kindOfRoom,floorRoom);
    }
}
