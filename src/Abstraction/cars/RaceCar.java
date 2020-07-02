package Abstraction.cars;

public abstract class RaceCar implements Car {

    public abstract String model();
    public abstract String horsePower();

    @Override
    public String engine() {
        return "LT1";
    }

    @Override
    public String wheels() {
        return "20 inch";
    }

    @Override
    public String brakes() {
        return "Bremboo";
    }

    @Override
    public String brakes(int pistons) {
        if(model().contains("SS") || model().contains("ZL1"))
            return "Bremboo 6 pistons";

        else return pistons + " piston brakes";
    }

    @Override
    public void start() {
        System.out.println("the cat has started");
    }

    @Override
    public void stop() {
        System.out.println("the car has stopped");
    }
}
