package ss10_dsa.exercise.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listCar = new MyList<>();
        listCar.add("Audi");
        listCar.add("Mercedes");
        listCar.add("Porsche");
        listCar.add("BMW");
        System.out.println("Car 1 : " + listCar.get(1));
        System.out.println("Car 2 : " + listCar.get(2));
        System.out.println("Car 3 : " + listCar.get(3));
        System.out.println("Car 4 : " + listCar.get(4));
        listCar.size();
        System.out.println(listCar.size());
        System.out.println(listCar.indexOf("a"));
    }
}
