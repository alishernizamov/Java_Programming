package day30_inheritance.phoneTask;

public class IPhone extends Phone{ //iPhone IS a Phone

    //to be able to call tha parent's constructor, we need to build a constructor at the child level
    /*
    Super constructor to call parent constructor
    public IPhone( String model, String size, int price, String color){
        super("Apple", model, size, price, color);
    }
*/ //shortcut: hover over the main class error, it gives the option, click on it
    //parent class constructor:
    public static boolean hasApplePay = true;

    public IPhone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public  void faceTime(long phoneNumber){
        System.out.println( getModel() +" is face timing with " +phoneNumber );
    }

    public void faceTime(String email){
        System.out.println( getModel() +" is face timing with " + email );
    }





}

/*
faceTime(long phoneNumber)
faceTime(String email)
 */
