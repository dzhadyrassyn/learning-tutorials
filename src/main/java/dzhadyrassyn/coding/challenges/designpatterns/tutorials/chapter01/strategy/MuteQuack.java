package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter01.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence ---");
    }
}
