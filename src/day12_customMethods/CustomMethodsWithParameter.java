package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(10_000);


    }

    public static void oddOrEven(int number){
        //parameter: check odd or even number
        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }

    //method that can check if a person is eligible to purchase alcohol
    //must have: age, data type: int


    //method that can check if number is odd/eve/zero
    //must have info: number, data type: int



    //method that calculate grade of a student
    //must have: score, data type: int
}
