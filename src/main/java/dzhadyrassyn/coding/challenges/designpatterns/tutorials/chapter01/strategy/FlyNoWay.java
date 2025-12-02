package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter01.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
