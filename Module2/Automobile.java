public class Automobile implements Comparable<Automobile> {
    private String model;
    private int year;
    private String brand;
    private String currentGear = "Park";
    private String initialGear = "Park";
    private double initialSpeed;
    private double currentSpeed;
    private double acceleration;
    private final String restingGear = "Park";


    public Automobile(String model, int year, String brand, double acceleration) {
        this.model = model;
        this.year = year;
        this.brand = brand;
        this.acceleration = acceleration;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getInitialGear() {
        return initialGear;
    }

    public void setGear(String initialGear) {
        this.initialGear = initialGear;
    }

    public String getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(String currentGear) {
        this.currentGear = currentGear;
    }

    public double getInitialSpeed() {
        return initialSpeed;
    }

    public void setInitialSpeed(double initialSpeed) {
        this.initialSpeed = initialSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void honk() {
        System.out.println("The " + brand + " is blowing the horn. Honk!!! Honk!!!");
    }

    public void accelerate(int seconds) {
        initialSpeed = currentSpeed;
        currentGear = "Forward";
        currentSpeed = currentSpeed + acceleration * seconds;
        System.out.println("The " + brand + " accelerated from " + initialSpeed + " mph to " + currentSpeed + " mph.");
    }

    public void decelerate(int seconds) {
        initialSpeed = currentSpeed;
        currentGear = "Forward";
        currentSpeed = currentSpeed - acceleration * seconds;
        System.out.println("The " + brand + " decelerated from " + initialSpeed + " mph to " + currentSpeed + " mph.");
    }

    public void reverse() {
        //initialGear = restingGear;
        if (currentGear.equals(restingGear)) {
            currentGear = "Reverse";
            System.out.println("The " + brand + " has switched gears from " + restingGear + " to " + currentGear + ".");
        }
        else if (currentGear.equals("Forward")) {
            initialGear = currentGear;
            currentGear = "Reverse";
            System.out.println("The " + brand + " has switched gears from " +  initialGear + " to " + currentGear + ".");
        }          
    }

    public void forward() {
        getCurrentGear();
        if (currentGear.equals(restingGear)) {
            currentGear = "Forward";
            System.out.println("The " + brand + " has switched gears from " + restingGear + " to " + currentGear + ".");
        }
        else if (currentGear.equals("Reverse")) {
            initialGear = currentGear;
            currentGear = "Forward";
            System.out.println("The " + brand + " has switched gears from " +  initialGear + " to " + currentGear + ".");
        }          
    }

    public void stop() {
        if (getCurrentSpeed() > 0) {
            setCurrentSpeed(0);
        }
        System.out.println("The " + brand + " has come to rest. The current speed is " + currentSpeed + ".");
    }

    @Override
    public String toString() {
        return "This car is a " + year + " " + brand + " " + model + ".";
    }


    @Override
    public int compareTo(Automobile other) {
        if (this.toString().compareTo(other.toString()) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }
}

class Car extends Automobile {
    public Car(String model, int year, String brand, double acceleration) {
        super(model, year, brand, acceleration);
    }

    @Override
    public void honk() {
        System.out.println("The " + this.getBrand() + " is blowing the horn. Toot!!! Toot!!!");
    }

    @Override
    public String toString() {
        return "This car is a " + this.getYear() + " " + this.getBrand() + " " + this.getModel() + ".";
    }

    @Override
    public int compareTo(Automobile other) {
        if (this.toString().compareTo(other.toString()) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }
}

class SportsCar extends Automobile {
    public SportsCar(String model, int year, String brand, double acceleration) {
        super(model, year, brand, acceleration);
    }

    @Override
    public void honk() {
        System.out.println("The " + this.getBrand() + " is blowing the horn. Beep!!! Beep!!!");
    }

    @Override
    public String toString() {
        return "This car is a " + this.getYear() + " " + this.getBrand() + " " + this.getModel() + ".";
    }

    @Override
    public int compareTo(Automobile other) {
        if (this.toString().compareTo(other.toString()) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }
}

class JunkCar extends Automobile {
    public JunkCar(String model, int year, String brand, double acceleration) {
        super(model, year, brand, acceleration);
    }

    @Override
    public void honk() {
        System.out.println("The " + this.getBrand() + " is blowing the horn. Honk!!! Honk!!!");
    }

    @Override
    public String toString() {
        return "This car is a " + this.getYear() + " " + this.getBrand() + " " + this.getModel() + ".";
    }

    @Override
    public int compareTo(Automobile other) {
        if (this.toString().compareTo(other.toString()) == 0) {
            return 0;
        }
        else{
            return 1;
        }
    }
}


class testRun {
    public static void main(String[] args) {
        Car car1 = new Car("Tacoma", 2022, "Toyota", 5);
        SportsCar car2 = new SportsCar("Mustang", 2023, "Ford", 10);
        JunkCar car3 = new JunkCar("Yugo", 1990, "Zastava", 1);

        Automobile[] cars = {car1, car2, car3};

        for (Automobile car : cars) {
            System.out.println(car);
            car.forward();
            car.accelerate(5);
            car.honk();
            car.decelerate(2);
            car.stop();
            car.reverse();
            car.accelerate(2);
            car.decelerate(1);
            car.stop();
            System.out.println();
        }

    System.out.println("Is the Car the same as the SportsCar?");
    if ((cars[0].compareTo(cars[1]) == 0)) {
        System.out.println("These cars are the same.");
    }
    else {
        System.out.println("These cars are not the same.");
    }

    System.out.println();

    System.out.println("Is the SportsCar the same as the JunkCar?");
    if ((cars[1].compareTo(cars[2]) == 0)) {
        System.out.println("These cars are the same.");
    }
    else {
        System.out.println("These cars are not the same.");
    }

    System.out.println();

    System.out.println("Is the Car the same as the JunkCar?");
    if ((cars[0].compareTo(cars[2]) == 0)) {
        System.out.println("These cars are the same.");
    }
    else {
        System.out.println("These cars are not the same.");
    }

    System.out.println();
    
    System.out.println("Are Car and SportsCar equal? " + cars[0].equals(cars[1]));
    System.out.println("Are Car and JunkCar equal? " + cars[0].equals(cars[2]));
    System.out.println("Are SportsCar and JunkCar cars equal? " + cars[1].equals(cars[2]));
    
    }
}