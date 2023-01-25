package day26_statics;

public class IPhoneTestObjects {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone12", "Black", 1000);
        System.out.println(iPhone.color);
        System.out.println(iPhone.model);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        //this is no error, but it is not the legal way to call statics through objects
 /*     System.out.println( iPhone.brand ); //brand is static and statics can be shared by all objects
        System.out.println( iPhone.OS  ); //we can call statics thru object 'iPhone'
        iPhone.printOperatingSystem(); //we called it through object 'iPhone' as wel
*/

        //this is a proper way to call statics: call through class names
        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);
        IPhone.printOperatingSystem();







    }
}
