package day32_finalKeyword.carTask_methodOverriding;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    //we are not overriding the start() method as we will use the default implementation of the method

}
/*
start(): "Press the brake and twist the key to ignition"
 */
