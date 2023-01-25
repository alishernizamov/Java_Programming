package day11_string;

public class StrBoolMeth_startsWith_endsWith {
    public static void main(String[] args) {

        String name = "Michael";

        boolean l = name.startsWith("Da");
        System.out.println("l = " + l);

        System.out.println("-----------------------");

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");

        System.out.println("isValid = " + isValid);

        System.out.println("-----------------endswith-------------");
        boolean t = url.endsWith(".com");
        System.out.println("t = " + t);

        String email = "cydeoschool@outlook.com";

        boolean isGmail = email.endsWith("gmail.com");

        boolean isYahoo = email.endsWith("yahoo.com");

        boolean isHotmail = email.endsWith("hotmail.com");

        System.out.println("isGmail = " + isGmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isHotmail = " + isHotmail);

    }
}
