package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter02.observer;

public class PhoneDisplay implements Observer, DisplayElement {

    private final Subject subject;
    private double temperature;
    private double humidity;
    private double pressure;

    public PhoneDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Phone Display: " + temperature + ", " + humidity + ", " + pressure);
    }
}
