package mvc.mvc_car.car_service;

import mvc.mvc_car.car_model.Car;
import mvc.mvc_car.car_repository.CarRepository;
import mvc.mvc_car.car_repository.ICarRepository;
import mvc.mvc_car.utils.NotFoundIdException;
import mvc.mvc_car.utils.ReadAndWrite;

import static mvc.mvc_car.car_view.Run.scanner;

public class CarService implements ICarService {
    ICarRepository carRepository = new CarRepository();

    @Override
    public void displayListCar() {
        for (Car car : carRepository.displayListCar()) {
            System.out.println(car);
        }
    }

    @Override
    public void addNewCar() {
        do {
            try {
                System.out.println("Nhập id của xe : ");
                int idCar = ReadAndWrite.inputInt();
                int index = carRepository.searchIdCar(idCar);
                if (index == -1){
                    System.out.println("Nhập tên của xe : ");
                    String nameCar = scanner.nextLine();
                    System.out.println("Nhập giá của xe : ");
                    int priceCar = ReadAndWrite.inputInt();
                    System.out.println("Nhập xy lanh của xe : ");
                    int xyLanhCar = ReadAndWrite.inputInt();
                    Car car = new Car(idCar, nameCar, priceCar, xyLanhCar);
                    carRepository.addNew(car);
                    break;
                }else {
                    displayListCar();
                    throw new NotFoundIdException();
                }
            }catch (NotFoundIdException e){
                System.out.println("Id này đã tồn tại");
            }
        }while (true);
    }

    @Override
    public void editCar() {
        boolean flag = true;
        Car car;
        System.out.println("Nhập id cần chỉnh sửa ");
        int id = ReadAndWrite.inputInt();
        int index = carRepository.searchIdCar(id);
        if (index == -1){
            System.out.println("Không tìm thấy id!!");
        }else {
            car = carRepository.getCar(index);
            do {
                System.out.println(car);
                    System.out.println("Nhập mục cần chỉnh sửa " +
                            "\n1.Id của xe" +
                            "\n2.Tên của xe" +
                            "\n3.Giá của xe" +
                            "\n4.Xy lanh của xe" +
                            "\n5.Lưu"
                            );
                int choice = ReadAndWrite.inputInt();
                switch (choice){
                    case 1:
                        System.out.println("Nhập id mới : ");
                        int newId = ReadAndWrite.inputInt();
                        car.setIdCar(newId);
                        break;
                    case 2:
                        System.out.println("Nhập tên xe mới : ");
                        String newNameCar = scanner.nextLine();
                        car.setNameCar(newNameCar);
                        break;
                    case 3:
                        System.out.println("Nhập giá xe mới : ");
                        int newPriceCar = ReadAndWrite.inputInt();
                        car.setPriceCar(newPriceCar);
                        break;
                    case 4:
                        System.out.println("Nhập xy lanh mới : ");
                        int newXyLanhCar = ReadAndWrite.inputInt();
                        car.setXyLanhCar(newXyLanhCar);
                        break;
                    case 5:
                        System.out.println("Lưu thông tin xe : ");
                        flag = false;
                        break;
                    default:
                        System.out.println("Bạn đã nhập sai!!!");
                        break;
                }
            }while (flag);
            System.out.println("Nhập yes để lưu!!");
            String choice = scanner.nextLine().toLowerCase().trim();
            if (choice.equals("yes")){
                carRepository.editCar(index,car);
                displayListCar();
            }else{
                System.out.println("Hủy bỏ!!");
            }
        }
    }

    @Override
    public void removeCar() {
        System.out.println("Nhập id cần xóa : ");
        int id = ReadAndWrite.inputInt();
        int index = carRepository.searchIdCar(id);
        if (index == -1) {
            System.out.println("Id không tồn tại!!");
        } else {
            System.out.println(carRepository.getCar(index));
            System.out.println("Nhập yes để xóa !!");
            String choice = scanner.nextLine().toLowerCase().trim();
            if (choice.equals("yes")) {
                carRepository.removeCar(index);
            } else {
                System.out.println("Hủy bỏ xóa!!");
            }
        }
    }
}
