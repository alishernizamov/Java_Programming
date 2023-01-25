package exercise;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Acc {
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
        ArrayDeque obj1 = new ArrayDeque();
        obj1.add(12);

        obj1.addAll(Arrays.asList(ref1,ref2, ref3));

        //System.out.println(Arrays.toString(obj1));


    }

}
