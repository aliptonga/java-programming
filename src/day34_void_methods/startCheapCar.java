package day34_void_methods;

public class startCheapCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void pressGasPedal() {
        System.out.println("4. Hold Steering wheel with 2 hands and press gas pedal");
    }
    public static void seatInCar() {
        System.out.println("1. Open the door and seat in driver seat");
    }
    public static void startTheCar() {
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive() {
        System.out.println("3. Press brake pedal and shift to 'D'");
    }


}
