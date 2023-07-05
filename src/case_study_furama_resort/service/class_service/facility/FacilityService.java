package case_study_furama_resort.service.class_service.facility;

import case_study_furama_resort.model.facility.Facility;
import case_study_furama_resort.repository.class_repository.FacilityRepository;
import case_study_furama_resort.repository.interface_repository.IFacilityRepository;
import case_study_furama_resort.service.interface_service.IFacilityService;

import java.util.Map;

import static mvc.mvc_student.view.Main.scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository facilityRepository = new FacilityRepository();
    @Override
    public void  displayListFacility() {
        int choice = 0;
        do {
            try {
                System.out.print("You want to show list:\n" +
                        "1.House\n" +
                        "2.Villa\n" +
                        "3.Room\n" +
                        "choose here : ");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Number... Try Again!!");
            }
        } while (choice <= 0 || choice > 3);
        Map<Facility, Integer> display = facilityRepository.displayFaciliti(choice);
        for (Map.Entry<Facility, Integer> s : display.entrySet()) {
            System.out.println(s);
        }
    }

    @Override
    public void displayListFacilityMainternance() {
        int choice = 0;
        do {
            try {
                System.out.print("You want to add :\n" +
                        "1. New House\n" +
                        "2. New Villa\n" +
                        "3. New Room\n" +
                        "4. Back to Menu\n" +
                        "choose here : ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        facilityRepository.addNewFacility(choice, ListHouse.addHouse());
                        break;
                    case 2:
                        facilityRepository.addNewFacility(choice, ListVilla.addVilla());
                        break;
                    case 3:
                        facilityRepository.addNewFacility(choice, ListRoom.addRoom());
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Function not Found!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please Enter Number... Try Again!!");
            }
        } while (choice < 0 || choice > 3);
    }

    @Override
    public void addNewFacility() {

    }
}
