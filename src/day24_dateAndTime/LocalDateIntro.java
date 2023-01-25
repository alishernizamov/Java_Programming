package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(1976,5,21);

        System.out.println(birthday);

        System.out.println("----------------------------------");

        System.out.println(today.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue()); //month number (ex; June is 6)

        System.out.println(today.getDayOfWeek());

        System.out.println(birthday.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("---------------------Special---Dates---------------------------");
        //plusYeas()

        today = today.plusYears(1); //2023-6-16 if you re-assign this back to 'today'

        System.out.println(today);

        System.out.println("---------------------Special---Dates---------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        //adding 2 years
        graduationDate = graduationDate.plusYears(2); //2027-6-4

        System.out.println(graduationDate);

        //adding 7 months
        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("---------------------Special---Dates---------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005,4,1);

        LocalDate brotherBirthday = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);
        System.out.println(brotherBirthday);

        LocalDate birthDate1 = LocalDate.of(1994,7,7); //July 7, 1994
        LocalDate birthDate2 = LocalDate.of(1995,7,7);

        boolean r1 = birthDate1.isEqual(birthDate2);

        System.out.println(r1);

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println( grad_date.isBefore( LocalDate.of(2022,12,31) )  );
        System.out.println( grad_date );

        System.out.println("---------------------Special---Dates---------------------------");

        System.out.println(  LocalDate.of(2022,1,1).isLeapYear()  );


    }
}
