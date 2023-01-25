package day37_exceptions;

import java.util.ArrayList;

public class ErrorExample {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();
        //this below code will make Java Hip run out of memory and result in 'Java heap spase' error
        int i = 0;
        while(true){
            System.out.println(++i);
            pizzas.add( new Pizza('S', 2,2));
        }

    }
}
