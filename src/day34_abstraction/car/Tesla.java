package day34_abstraction.car;

public class Tesla extends Car{
    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use voice command to start "+getMake()+" "+getModel());
    }

    public void autopilot(){
        System.out.println(getMake()+" "+getModel()+" has auto pilot feature");
    }

}
