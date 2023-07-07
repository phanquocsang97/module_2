package mvc.mvc_car.car_view;

import mvc.mvc_car.car_controller.CarController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CarController controller = new CarController();
        controller.displayMenu();
    }
}
