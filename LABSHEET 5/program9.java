
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }

    void stop() {
        System.out.println("Vehicle is stopping.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Electric car battery is charging.");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.stop();
        e.drive();
        e.chargeBattery();
    }
}
