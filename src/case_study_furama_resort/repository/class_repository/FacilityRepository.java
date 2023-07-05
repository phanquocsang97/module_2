package case_study_furama_resort.repository.class_repository;

import case_study_furama_resort.model.facility.Facility;
import case_study_furama_resort.model.facility.House;
import case_study_furama_resort.model.facility.Room;
import case_study_furama_resort.model.facility.Villa;
import case_study_furama_resort.repository.interface_repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FacilityRepository implements IFacilityRepository {
    static Map<Facility,Integer> houseListFacitily = new LinkedHashMap<>();
    static Map<Facility,Integer> villaListFacility = new LinkedHashMap<>();
    static Map<Facility,Integer> roomListFacility = new LinkedHashMap<>();
    static {
        houseListFacitily.put(new House("SVHO-0001", "Swimming Pool", "100000", "500000", "5", "week", "Vip", "3"), 0);
        houseListFacitily.put(new House("SVHO-0002", "Double Room", "200000", "1000000", "6", "week", "Vip", "3"), 0);
        villaListFacility.put(new Villa("SVVL-0001", "Family Villa", "200000", "1000000", "10", "week", "Standard", "200", "3"), 0);
        villaListFacility.put(new Villa("SVVL-0002", "Family Villa", "100000", "1000000", "8", "week", "Standard", "100", "3"), 0);
        roomListFacility.put(new Room("SVRO-0001", "Family Room", "5000", "10000", "3", "day", "Common"), 0);
        roomListFacility.put(new Room("SVRO-0002", "Family Room", "7000", "15000", "4", "day", "Common"), 0);
    }


    @Override
    public Map<Facility, Integer> displayFaciliti(int choice) {
        switch (choice) {
            case 1:
                return houseListFacitily;
            case 2:
                return villaListFacility;
            case 3:
                return roomListFacility;
            default:
                return null;
        }

    }
    @Override
    public void addNewFacility(int choice, Facility facility) {
        switch (choice) {
            case 1:
                houseListFacitily.put(facility, 0);
            case 2:
                villaListFacility.put(facility, 0);
            case 3:
                roomListFacility.put(facility, 0);
        }
    }

    @Override
    public String searchIndexFacility(int choice, String id) {
        switch (choice) {
            case 1:
                Map<Facility, Integer> houseIntegerMap = displayFaciliti(choice);
                for (Map.Entry<Facility, Integer> s : houseIntegerMap.entrySet()) {
                    if (Objects.equals(s.getKey().getIdService(), id)) {
                        return "true";
                    } else {
                        return "-1";
                    }
                }
            case 2:
                Map<Facility, Integer> villaIntegerMap = displayFaciliti(choice);
                for (Map.Entry<Facility, Integer> s : villaIntegerMap.entrySet()) {
                    if (Objects.equals(s.getKey().getIdService(), id)) {
                        return "true";
                    } else {
                        return "-1";
                    }
                }
            case 3:
                Map<Facility, Integer> roomIntegerMap = displayFaciliti(choice);
                for (Map.Entry<Facility, Integer> s : roomIntegerMap.entrySet()) {
                    if (Objects.equals(s.getKey().getIdService(), id)) {
                        return "true";
                    } else {
                        return "-1";
                    }
                }
            default:
                return "Try again!!";
        }
    }

    @Override
    public void displayMaintance() {

    }
}
