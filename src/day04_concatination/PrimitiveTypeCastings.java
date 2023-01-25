package day04_concatination;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {

        //---------Implicit Casting---------------------------------
        //Assigning smaller prim type data to larger prim type

        byte a = 15; //byte is the smallest prim numerical type

        short b = a;
        //short b = (short)a;

        System.out.println(b);

        int c = a; //implicit casting

        long d = 3000L; //what happened in the background is 3000 was casted to long

        float f = d; //implicit casting

        //---------Explicit Casting------------------------
        //Must be carried out manually
        //Assigning larger prim types to smaller prim type

        int x = 100;
        byte y = (byte) x;

        float z = 20.8f; //add F or f at the end of the data to assign it to float as it is double

        short q = (short) z; //z = 20.8

        System.out.println(q);

        double n1 = 2.5;

        byte n2 = (byte) n1;

        System.out.println(n2); //result is 2 because byte does not have decimal

        double  u = 3000.5;
        int p = (int) u; //explicit casting (not direct assignment)

        System.out.println(p);

        int o = 100;
        double pl = o;

        System.out.println(pl);

    }
}
