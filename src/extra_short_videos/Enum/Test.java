package extra_short_videos.Enum;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        //String day = "Monday";
        Day day = Day.MONDAY; //all are constant

        switch (day){
            case MONDAY:
                System.out.println("It is Monday");
                break;

            case TUESDAY:
                System.out.println("It is Tuesday");
                break;
        }


        Day[] weekdays = Day.values(); //all values for Enum
        System.out.println(Arrays.toString(weekdays));


    }
}
