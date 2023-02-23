package CarShowroom;

import java.util.Scanner;

public class CarsManagement {

    Scanner sc = new Scanner(System.in);

    public Car getCarName(){
        System.out.print("Name: ");
        String carName = checkValidCar();
        return Car.valueOf(carName);
    }

    public String getColor(){
        System.out.print("Color: ");
        String carColor = CheckValidColor();
        return carColor;
    }

    public String getPrice(){
        System.out.print("Price: ");
        String carPrice = checkValidPrice();
        return carPrice;
    }

    public Day getSellsDay(){
        System.out.print("Today: ");
        String sellDay = checkValidDay();
        return Day.valueOf(sellDay);
    }

    public Car checkCar(Car car, String color, String price, Day day){
        
    }
}

class ExceptionCar extends Exception{

    public ExceptionCar(){
    }

    public ExceptionCar(String msg){
        super(msg);
    }
}
