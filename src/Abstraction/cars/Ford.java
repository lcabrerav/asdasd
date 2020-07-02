package Abstraction.cars;

public class Ford implements Car {

    @Override
    public String engine() {
        return "Coyote";
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
    public void start() {
        System.out.println("the cat has started");
    }

    @Override
    public void stop() {
        System.out.println("the car has stopped");
    }
}
