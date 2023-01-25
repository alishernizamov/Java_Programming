package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if (i == 4){    //<<<----- this statement makes it skip 4 and jump to the next one
                continue;   //skips 4 and continues with the main condition
            }
            System.out.println(i);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();

        for (int i = 10; i < 21; i++) {
            if(i % 2 == 0){  //if i is even it skips it (it skips or doesn't print even numbers)
                continue;    //and continue with the rest
            }
            System.out.print(i);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();

        for (char i = 'A'; i <= 'G' ; i++) {
            if (i == 'B' || i == 'F'){
                continue;
            }
            System.out.println(i);
        }

        //find the sum of all even nums bw 50 and 100
        for (int i = 50; i <= 100; i++) {
            if (i%2==0){ // getting even numbers
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int i = 50; i < 101; i+=2) {  // getting even numbers
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 50; i < 101; i++) {
            if (i % 2 !=0){ //
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
/*

 */