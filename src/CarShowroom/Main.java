package CarShowroom;

public class Main {
    public static void main(String[] args) throws Exception {
        CarsManagement carList = new CarsManagement();
        //Step 1: Get car name
        Car car = carList.getCarName();
        //Step 2: Get car color
        String color = carList.getColor();
        //Step 3: Get car price
        String price = carList.getPrice();
        //Step 4: Get day that sells car
        Day day = carList.getSellsDay();
        //Step 5: Check that user's need match with cars in showroom
        carList.checkCar(car, color, price, day);
        //Step 6: Exit program
        System.exit(0);
    }
}
