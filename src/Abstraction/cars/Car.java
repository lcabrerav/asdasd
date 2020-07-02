package Abstraction.cars;

public interface Car {

    String engine();
    String wheels();
    String brakes();
    default String brakes(int pistons){
        return "4 pistons stock";
    }
    void start();
    void stop();
}
