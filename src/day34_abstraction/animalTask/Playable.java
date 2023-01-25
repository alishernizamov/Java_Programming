package day34_abstraction.animalTask;

public interface Playable {  //static and final
    boolean isFriendly = true; //this is final value of this variable: public static final

    /*
    public static void main(String[] args) {
//        isFriendly = false;

        System.out.println(isFriendly); //it is public as it is callable
    }

    public default void method1(){ //you can set it as default, it becomes instance method in a sub class

    }
  */

     void play(); //public abstract - no need to put as it is publ stat method

}
