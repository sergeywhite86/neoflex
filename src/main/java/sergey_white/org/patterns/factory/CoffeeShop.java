package sergey_white.org.patterns.factory;

public class CoffeeShop {
    private final CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.createCoffee(coffeeType);
        coffee.grindCoffee();
        coffee.roastCoffee();
        coffee.brewingCoffee();
        System.out.printf("Your %s ready\n", coffee.getName());
    }
}
