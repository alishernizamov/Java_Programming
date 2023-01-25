package day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        //int total  = sum(20,40); //sum is a 'void' method therefore does not return any data

        int total = addition(10,20);

        int t = square(10); //

        //System.out.println(square(10));

        cube(3);
        System.out.println(cube(3));

    }

    public static void sum(int n1, int n2){
        //it is a void method

        int result = n1 + n2;

    }

    //return method
    public static int addition (int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    //return method 2
    public static int square(int num){

        int square = num * num;

        return square; //you have to put a 'return' statement
    }

    public static int cube(int num){

        //int cube = num * num * num; //num^3
        int cube = square(num) * num;



        return cube;
    }

}
