package day34_abstraction.car;

public abstract class Car { //class is meant to be inherited and cannot be instantiated

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); //class name will be set to the make of the car
        this.model = model;
        setColor(color);
        if (year<1886){
            System.err.println("Invalid year: "+year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //setters - non-final ones only
    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid Price: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    //methods
    protected final void stop(){ //make sure non-sub classes outside the package can not access it
        System.out.println("Press the brake to stop "+make+" "+model);
    }

    protected abstract void start(); //is meant to be overridden with different implementations by sub classes
    //protected - makes it accessible by the subclasses only from outside the package as well


    @Override
    public String toString() {
        return make + "{" +
                "model ='" + model + '\'' +
                ", color ='" + color + '\'' +
                ", year =" + year +
                ", price= $" + price +
                '}';
    }
}

/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be less than negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement
 */
