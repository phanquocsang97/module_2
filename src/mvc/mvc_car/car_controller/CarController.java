package mvc.mvc_car.car_controller;

import mvc.mvc_car.car_service.CarService;
import mvc.mvc_car.car_service.ICarService;
import mvc.mvc_car.utils.ReadAndWrite;

import static mvc.mvc_car.car_view.Run.scanner;

public class CarController {
    ICarService carService = new CarService();
    public void displayMenu(){
        do {
            System.out.println("Chọn các chức năng : " +
                    "\n1.Hiển thị danh sách xe" +
                    "\n2.Thêm xe mới vào danh sách " +
                    "\n3.Xóa xe khỏi danh sách " +
                    "\n4.Chỉnh sửa xe trong danh sách " +
                    "\n5.Thoát chương trình"
                    );
            int  choose = ReadAndWrite.inputInt();
            switch (choose){
                case 1:
                    System.out.println("Hiển thị danh sách xe");
                    carService.displayListCar();
                    break;
                case 2:
                    System.out.println("Thêm xe mới vào danh sách");
                    carService.addNewCar();
                    break;
                case 3:
                    System.out.println("Xóa xe khỏi danh sách");
                    carService.removeCar();
                    break;
                case 4:
                    System.out.println("Chỉnh sửa xe trong danh sách");
                    carService.editCar();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Bạn đã nhập sai !!!");
            }
        }while (true);
    }
}
