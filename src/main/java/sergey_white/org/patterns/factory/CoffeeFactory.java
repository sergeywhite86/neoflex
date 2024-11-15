package sergey_white.org.patterns.factory;

public class CoffeeFactory {
    public Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;
        switch (coffeeType) {
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
        }
        if (coffee == null) {throw new IllegalArgumentException("coffee is absent");}
        return coffee;
    }
}
