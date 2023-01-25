package day38_exceptions;

import utilities.Library;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

        Library.sleep(3.5);

    }

    public static void pauseFor5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }



}
