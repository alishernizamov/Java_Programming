package day07_IF_Statement;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int salary = 100_000;
        boolean isMarried = true;
        double taxRate = 0;

        if(salary >= 130_000){ //if salary is higher than 130k, taxrate is 35%
            taxRate = .35;
        }
        if(salary >= 100_000 && salary < 130_000){ //if salary is bw 100k to 130k (exlided) than the taxrate = 30%
            taxRate = .3;
        }
        if(salary >= 80_000 && salary < 100_000){ //
            taxRate = .25;
        }
        if(salary < 80_000){
            taxRate = .2;
        }

        if (isMarried){ //if persome is married
            taxRate -= .05; //tax is reduced by 5%
        }

        System.out.println("Net Income = " + salary * (1-taxRate));

    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */
