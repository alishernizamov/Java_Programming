package day31_inheritance.shape_MethodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("---------circle object-----------------------");

        Circle circle = new Circle(3.5);
        System.out.println(circle);

        circle.draw();

        System.out.println("---------triangle object-----------------------");
        Triangle triangle = new Triangle(10, 10.5, 6);
        System.out.println(triangle);

        triangle.draw();

        System.out.println("---------rectangle object-----------------------");
        Rectangle rectangle = new Rectangle(12, 6);
        System.out.println(rectangle);

        rectangle.draw();


    }
}
