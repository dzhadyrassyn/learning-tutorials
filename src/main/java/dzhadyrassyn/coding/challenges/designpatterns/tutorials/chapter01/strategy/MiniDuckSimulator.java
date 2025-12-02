package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter01.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();

        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
    }
}
