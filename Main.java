package javaCore1_2;

public class Main {
    public static void main(String[] args) {
        Car car = () -> System.out.println("Car goes");
        car.go();
        car.stop();
//        System.out.println(Car.SPEED);
        Car.printSpeed();
    }
}
