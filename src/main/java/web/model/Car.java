package web.model;


public class Car {

    private String model;

    private int number;

    private int engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public Car(String model, int number, int engine) {
        this.model = model;
        this.number = number;
        this.engine = engine;
    }
}
