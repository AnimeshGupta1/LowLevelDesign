package Intro;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehavior;

    public Duck() {
    }
    
    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehavior = qb;
    }
    
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
