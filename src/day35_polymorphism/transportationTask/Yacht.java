package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Swimmable;

public class Yacht extends Transportation implements Swimmable {

    public Yacht(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void swim() {

    }
}
