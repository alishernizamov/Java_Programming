package extra_short_videos.Generics;

import java.util.List;

public class Generics {

    public static <T> void printEach(T[] t){
        for (T each : t){
            System.out.println(each);
        }
    }
    
    public static <T> void printEach(List<T> list){
        for (T each : list) {
            System.out.println(each);
        }
    }


}
