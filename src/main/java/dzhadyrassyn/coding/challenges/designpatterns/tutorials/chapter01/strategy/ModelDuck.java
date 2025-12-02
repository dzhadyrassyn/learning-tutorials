package dzhadyrassyn.coding.challenges.designpatterns.tutorials.chapter01.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a ModelDuck");
    }
}
