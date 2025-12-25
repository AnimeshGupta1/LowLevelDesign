package DecoratingPattern;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
    public double cost() {
        return 0.33 + beverage.cost();
    }
}
