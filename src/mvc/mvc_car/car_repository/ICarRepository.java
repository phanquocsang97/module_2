package mvc.mvc_car.car_repository;

import mvc.mvc_car.car_model.Car;

import java.util.List;

public interface ICarRepository {
    List<Car> displayListCar();
    void addNew(Car car);
    void editCar(int index, Car car);
    void removeCar(int index);
    int searchIdCar(int id);
    Car getCar(int index);
}
