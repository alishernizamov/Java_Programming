package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {
        //dog object 1
        Dog dog1 = new Dog(); //it is a Dog object

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "Gray";

        //dog object 2
        Dog dog2 = new Dog();

        dog2.name = "Bella";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "Orange";


        //dog object 3
        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "Chow Chow", 'm', 3, "medium", "black");

        //dog object 4
        Dog dog4 = new Dog();
        dog4.setInfo("Chuck", "bulldog", 'M', 5, "small", "white");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog2.eat();
        dog3.drink();


    }
}
