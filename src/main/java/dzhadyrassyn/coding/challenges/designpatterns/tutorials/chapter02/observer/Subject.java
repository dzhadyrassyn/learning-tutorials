package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter02.observer;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
