package day34_abstraction.car;

public class Audi extends Car{
    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press Start button to start "+getMake()+" "+getModel());
    }

    public void autopark(){
        System.out.println(getMake()+" "+getModel()+" has an autopark feature");
    }

}
