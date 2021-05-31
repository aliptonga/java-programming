package day48_constructors_static;

public class Engine {
    private int cylinders;

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public Engine(int cylinders) {
        this.cylinders = cylinders;
    }
}
