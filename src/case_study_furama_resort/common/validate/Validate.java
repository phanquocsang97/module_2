package case_study_furama_resort.common.validate;

import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String validateIdEmployee() {
        final String REGEX_ID = "^NV-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Nhập mã nhân viên theo định dạng 'NV-XXXX': ");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return id;
    }

    public static String validateIdCustomer() {
        final String REGEX_ID = "^KH-[0-9]{4}$";
        boolean check = true;
        String id = null;
        do {
            try {
                System.out.println("Nhập mã khách hàng theo định dạng 'KH-XXXX' : ");
                id = scanner.nextLine();
                check = id.matches(REGEX_ID);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return id;
    }

    public static String validateName() {
        final String REGEX_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
        boolean check = true;
        String name = null;
        do {
            try {
                System.out.println("Nhập tên với chữ cái đầu viết hoa : ");
                name = scanner.nextLine();
                check = name.matches(REGEX_NAME);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return name;
    }

    public static String validateDate() {
        final String REGEX_DATE = "^([0-2]\\d|30|31)\\-([0]\\d|10|11|12)\\-(200[0-5]|19[6-9][0-9])$";
        boolean check = true;
        String date = null;
        do {
            try {
                System.out.println("Nhập ngày sinh ít nhất  18 tuổi : ");
                date = scanner.nextLine();
                check = date.matches(REGEX_DATE);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return date;
    }

    public static String validateIdentityNumber() {
        final String REGEX_IDENTITY = "^\\d{9,12}$";
        boolean check = true;
        String identity = null;
        do {
            try {
                System.out.println("Nhập CMND (9->12 số)");
                identity = scanner.nextLine();
                check = identity.matches(REGEX_IDENTITY);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return identity;
    }

    public static String validatePhoneNumber() {
        final String REGEX_NUMBERPHONE = "^0[0-9]{9}$";
        boolean check = true;
        String numberPhone = null;
        do {
            try {
                System.out.println("Nhập SĐT (bắt đầu là số 0, gồm 10 số) : ");
                numberPhone = scanner.nextLine();
                check = numberPhone.matches(REGEX_NUMBERPHONE);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return numberPhone;
    }

    public static String validateSalary() {
        boolean flag = true;
        String salary = null;
        do {
            try {
                System.out.println("Nhập lương ( > 0)");
                salary = scanner.nextLine();
                if (Integer.parseInt(salary) > 0) {
                    return salary;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
                flag = false;
            }
        } while (true);
    }

    public static String validateIdFacility() {
        final String REGEX_IDFACILITY = "^SV+(VL|HO|RO)-[0-9]{4}$";
        boolean check = true;
        String idFacility = null;
        do {
            try {
                System.out.println("Nhập mã dịch vụ với định dạng 'SVXX-YYYY' ");
                idFacility = scanner.nextLine();
                check = idFacility.matches(REGEX_IDFACILITY);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại!!!");
            }
        } while (!check);
        return idFacility;
    }

    public static String validateNameAndTypeFacility() {
        final String REGEX_NAMEANDTYPEFACILITY = "^([A-Z][a-z]+\\s)+[a-z]*$";
        boolean check = true;
        String nameAndTypeFacility = null;
        do {
            try {
                System.out.println("Nhập tên dịch vụ với chữ cái đầu viết hoa :");
                nameAndTypeFacility = scanner.nextLine();
                check = nameAndTypeFacility.matches(REGEX_NAMEANDTYPEFACILITY);
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (!check);
        return nameAndTypeFacility;
    }
    public static String validateAreaAndPoolFacility(){
        boolean flag = true;
        String areaFacility = null;
        do {
            try {
                System.out.println("Nhập diện tích sử dụng ( > 30m2) : ");
                areaFacility = scanner.nextLine();
                if (Integer.parseInt(areaFacility) > 30) {
                    return areaFacility;
                } else {
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại !!");
                flag = false;
            }
        } while (true);
    }
    public static String validateCostAndFloorFacility(){
        boolean flag = true;
        String costAndFloorFacility = null;
        do {
            try {
                System.out.println("Nhập chi phí thuê ( > 0 ) : ");
                costAndFloorFacility = scanner.nextLine();
                if (Integer.parseInt(costAndFloorFacility) > 0){
                    return costAndFloorFacility;
                }else {
                    flag = false;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập lại !!");
                flag = false;
            }
        }while (true);
    }
    public static String validatePeopleFacility(){
        boolean flag = true;
        String peopleFacility = null;
        do {
            try {
                System.out.println("Nhập số lượng người ( 0 - 20/ng ) : ");
                peopleFacility = scanner.nextLine();
                if (Integer.parseInt(peopleFacility) > 0 || Integer.parseInt(peopleFacility) < 20){
                    return peopleFacility;
                }else {
                    flag = false;
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập lại !!");
            }
        }while (true);
    }
}

