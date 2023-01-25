package day31_inheritance.shape_MethodOverriding;

public class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double side1, double width) {
        setLength(side1);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double perimeter(){
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\t*  *  *  *  *  *  *");
        for (int i = 0; i < 2; i++){
            System.out.println("\t*                 *");
        }
        System.out.println("\t*  *  *  *  *  *  *");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name= '" + getName() + '\'' +
                ", sides= " + "length: "+ getLength()+", "+"width: "+ getWidth()+
                ", area= '" + area() + '\'' +
                ", perimeter= '" + perimeter() + '\'' +
                '}';
    }
}
