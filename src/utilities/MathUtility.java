package utilities;

public class MathUtility {

    //RETURN FACTORIAL NUMBER
    public static int factorials(int num){

        int n = 0;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        return factorial;

    }


}

