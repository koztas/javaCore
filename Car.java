package javaCore1_2;

@FunctionalInterface
public interface Car {

    int SPEED = 100;

    void go();
    default void stop() {
        System.out.println("Car stopped");
    }

     static void printSpeed() {
        System.out.println(SPEED);
    }
}
