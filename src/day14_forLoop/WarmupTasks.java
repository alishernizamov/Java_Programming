package day14_forLoop;

public class WarmupTasks {
    public static void main(String[] args) {
        String str3 = combine("java","apple");

        String s1 = "" + true; //"true" - adding an empty string ("") converted the boolean keyword into a string
        String s2 = "" + 'a'; //"e" and not 'e'
        System.out.println(str3);

        System.out.println("-----------------------------------");

        System.out.println(  sumOf2IntNums(10, 20)  );
        System.out.println(  sumOf3IntNums(10, 20, 30)  );
        System.out.println(  sumOf4IntNums(10, 20, 30, 40)  );
    }

    public static String combine(String str1, String str2){

        String result;
        //1st approach
/*
        if ( str1.endsWith( "" + str2.charAt(0) ) ){ //if the 1st string ends with the same character of the 1st char of the 2nd string
            result = str1 + str2.substring(1);
        }else {
            result = str1 + str2;
        }
 */

        //2nd approach
        if ( str1.charAt(str1.length()-1) == str2.charAt(0) ){   //if the last char of the 1st string is equal to the 1st char of the 2nd string
            result = str1 + str2.substring(1); //1st char of the 2nd string will be excluded
        }else{
            result = str1 + str2;
        }
        return result;
    }

    public static int sumOf2IntNums(int n1, int n2){
        return n1 + n2;
    }

    public static int sumOf3IntNums(int n1, int n2, int n3){
        //return n1 + n2 + n3;
        return sumOf2IntNums(n1, n2) + n3; //we just reused the above method that sums 2 int numbers
    }

    public static int sumOf4IntNums(int n1, int n2, int n3, int n4){
        //return n1 + n2 + n3 + n4;
        //return sumOf3IntNums(n1, n2, n3) + n4;
        //return sumOf2IntNums(n1, n2) + sumOf2IntNums(n3, n4);
        return sumOf2IntNums( sumOf3IntNums(n1, n2, n3), n4 );
    }



}
