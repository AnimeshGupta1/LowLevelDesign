package Intro;

public class Simulator {
    public static void main(String[] args) {
        Duck mallard = new Mallard();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
