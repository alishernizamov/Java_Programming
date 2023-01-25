package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 3;

/*
        if (floorNumber >= 1 && floorNumber <= 3){

            if (floorNumber == 1){
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            }else if (floorNumber == 2){
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            }else{
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            }

        }else{
            System.out.println("invalid floor entry");
        }


    }
}
*/

        String result = "Invalid floor entry";

        if (floorNumber >= 1 && floorNumber <= 3) { //at the end, only one block will be executed

            result = "Floor "+floorNumber+" selected. Companies: "; //and the rest of the string will be concatenated
                                                                    // to this variable. If the precondition is not met
            if (floorNumber == 1) {                                 // the default string of 'result' will be printed
                result += "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                result += "Cydeo, NASA, Intelsat";
            } else {
                result += "Lyft, BofA, Stake house";
            }

        } //no need to put an else block here as it's not necessary. The default string of variable result will be printed

        System.out.println(result);
    }
}





        /*

1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */
