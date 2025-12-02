package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter01.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with wings!");
    }
}
