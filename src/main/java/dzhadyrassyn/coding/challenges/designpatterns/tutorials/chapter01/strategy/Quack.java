package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter01.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
