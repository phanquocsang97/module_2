package mvc.mvc_car.car_repository;

import mvc.mvc_car.car_model.Car;
import mvc.mvc_car.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    @Override
    public List<Car> displayListCar() {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_CAR);
        List<Car> carList = new ArrayList<>();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            carList.add(new Car(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3])));
        }
        return carList;
    }

    @Override
    public void addNew(Car car) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_CAR);
        stringList.add(car.converToString());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_CAR, stringList, false);
    }

    @Override
    public void editCar(int index, Car car) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_CAR);
        stringList.set(index, car.converToString());
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_CAR, stringList, false);
    }

    @Override
    public void removeCar(int index) {
        List<String> stringList = ReadAndWrite.readFileBook(ReadAndWrite.PATH_FILE_CAR);
        stringList.remove(index);
        ReadAndWrite.writeFileBook(ReadAndWrite.PATH_FILE_CAR, stringList, false);
    }

    @Override
    public int searchIdCar(int id) {
        for (int i = 0; i < displayListCar().size(); i++) {
            if (displayListCar().get(i).getIdCar() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Car getCar(int index) {
        return displayListCar().get(index);
    }

}
