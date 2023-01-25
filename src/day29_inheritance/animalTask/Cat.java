package day29_inheritance.animalTask;

public class Cat extends Animal {

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }




}
/*
PARENT CLASS - doesn't have preference, will contain only common attributes
0. Animal
    attributes (is it need for the child classes?): name, breed, gender, size, color, age
    methods (is it need for the child classes?): setInfo(), eat(), sleep(), drink(), toString

CHILD CLASS(ES)
1. Dog
    attributes: [will be inherited via keyword 'extends' from the Parent class]
    methods: [the commons will be inherited from the Parent class], bark()

2. Cat
    attributes: [will be inherited via keyword 'extends' from the Parent class]
    methods: [the commons will be inherited from the Parent class], meow(), scratch()

3. Tiger
    attributes: [will be inherited via keyword 'extends' from the Parent class]
    methods: [the commons will be inherited from the Parent class], hunt()
 */
