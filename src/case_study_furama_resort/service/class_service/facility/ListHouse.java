package case_study_furama_resort.service.class_service.facility;

import case_study_furama_resort.common.validate.Validate;
import case_study_furama_resort.model.facility.Facility;
import case_study_furama_resort.model.facility.House;
import case_study_furama_resort.repository.class_repository.FacilityRepository;
import case_study_furama_resort.repository.interface_repository.IFacilityRepository;

public class ListHouse {
    public static Facility addHouse() {
        String idHouse = Validate.validateIdFacility();
        String nameHouse = Validate.validateNameAndTypeFacility();
        String areaHouse = Validate.validateAreaAndPoolFacility();
        String costHouse = Validate.validateCostAndFloorFacility();
        String peopleHouse = Validate.validatePeopleFacility();
        String rentalTypeHouse = Validate.validateNameAndTypeFacility();
        String kindOfHouse = Validate.validateNameAndTypeFacility();
        String floorHouse = Validate.validateCostAndFloorFacility();

        return new House(idHouse, nameHouse, areaHouse, costHouse, peopleHouse, rentalTypeHouse, kindOfHouse, floorHouse);

    }
}
