package sergey_white.org.patterns.factory;

public abstract class Coffee {

    public void grindCoffee() {
        System.out.println("Grinding Coffee");
    }

    public void roastCoffee() {
        System.out.println("Roasting Coffee");
    }

    public void brewingCoffee() {
        System.out.println("Brewing Coffee");
    }

    public abstract String getName();

}
