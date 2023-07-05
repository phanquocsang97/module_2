package case_study_furama_resort.service.class_service.facility;

import case_study_furama_resort.common.validate.Validate;
import case_study_furama_resort.model.facility.Facility;
import case_study_furama_resort.model.facility.Villa;

public class ListVilla {
    public static Facility addVilla(){
        String idVilla = Validate.validateIdFacility();
        String nameVilla = Validate.validateNameAndTypeFacility();
        String areaVilla = Validate.validateAreaAndPoolFacility();
        String costVilla = Validate.validateCostAndFloorFacility();
        String peopleVilla = Validate.validatePeopleFacility();
        String kindOfRentVilla = Validate.validateNameAndTypeFacility();
        String kindOfRoom = Validate.validateNameAndTypeFacility();
        String areaPoolVilla = Validate.validateAreaAndPoolFacility();
        String floorVilla = Validate.validateCostAndFloorFacility();
        return new Villa(idVilla,nameVilla,areaVilla,costVilla,peopleVilla,kindOfRentVilla,kindOfRoom,areaPoolVilla,floorVilla);
    }
}
