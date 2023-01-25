package day26_statics;

import java.io.OutputStream;
import java.util.function.DoubleToIntFunction;

public class IPhone {

    //Attributes of object "iPhone"
    public static String brand = "Apple"; //static variable: all iphone objects' brand is Apple
    public String model; //instance: different models. We initialize it in the Constructor bc Constructor gets executed separately for each object
    public String color; //instance: different colors
    public double price; //instance: different prices
    public static String OS = "IOS"; //static: it is the same for all iPhone objects
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExpensiveToFix = true;

/*
    public static void  printPhoneInfo(){ //static only accepts statics, it cannot share what objects values
        System.out.println("Model: " + model);
        System.out.println("Color: "+ color);
    }
*/

    public void printPhoneInfo(){ //this is an instance method.
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void  printOperatingSystem(){ //this is a static method and we used only static variable
        System.out.println("operating system: "+ OS);
    }

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}
/*
Attributes:
brand (same-static), model (different-instance), color, (different instance), price (different),
OS (static), madeIn (static), hasBattery, isTouchScreen, isExpensiveToFix

 */
