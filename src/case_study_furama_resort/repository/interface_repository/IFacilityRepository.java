package case_study_furama_resort.repository.interface_repository;

import case_study_furama_resort.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository extends IGeneralRepository{
    Map<Facility,Integer> displayFaciliti(int choice);
    void addNewFacility(int choice, Facility facility);
    String searchIndexFacility(int choice, String id);
    void displayMaintance();
}
