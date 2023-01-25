package day31_inheritance.animal_methodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion);
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" eating a deer");;
    }

    public void hunt(){
        System.out.println("Lion "+getName()+" is hunting");
    }


    @Override
    public String toString() {
        return super.toString().replace("}","") + //this is an overriden meth of toString from Parent. Since the original meth comes with "}", replace method replaces that with ""
                ", African lion ='" + isAfricanLion + '\'' +
                '}';
    }
}
