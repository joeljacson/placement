public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int speed;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0;
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("The " + color + " " + year + " " + make + " " + model + " accelerates to " + speed + " km/h.");
    }

    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("The " + color + " " + year + " " + make + " " + model + " slows down to " + speed + " km/h.");
    }

    public void honk() {
        System.out.println("Beep! Beep!");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022, "Red");
        myCar.accelerate(30);
        myCar.brake(10);
        myCar.honk();
    }
}
